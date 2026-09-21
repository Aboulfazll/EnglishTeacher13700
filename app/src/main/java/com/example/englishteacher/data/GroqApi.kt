package com.example.englishteacher.data

import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Url
import java.net.InetSocketAddress
import java.net.Proxy
import java.util.concurrent.TimeUnit

// ============ مدل درخواست ============
data class ChatRequest(
    @SerializedName("model") val model: String,
    @SerializedName("messages") val messages: List<ChatMessage>,
    @SerializedName("temperature") val temperature: Float = 0.7f,
    @SerializedName("max_tokens") val maxTokens: Int = 1024
)

data class ChatMessage(
    @SerializedName("role") val role: String,
    @SerializedName("content") val content: String
)

// ============ مدل پاسخ ============
data class ChatResponse(
    @SerializedName("choices") val choices: List<Choice>
)

data class Choice(
    @SerializedName("message") val message: ChatMessage
)

// ============ API Interface ============
interface GroqApi {
    @POST
    suspend fun chatCompletion(
        @Url url: String = "https://api.groq.com/openai/v1/chat/completions",
        @Header("Authorization") auth: String,
        @Header("Content-Type") contentType: String = "application/json",
        @Body request: ChatRequest
    ): ChatResponse
}

// ============ ساختار تنظیمات پروکسی ============
data class ProxyConfig(
    val name: String,
    val useProxy: Boolean,
    val type: Proxy.Type = Proxy.Type.HTTP,
    val host: String = "127.0.0.1",
    val port: Int = 0
)

object GroqClient {
    private const val BASE_URL = "https://api.groq.com/"

    // مدل‌های موجود
    const val MODEL_LLAMA_31 = "llama-3.1-8b-instant"
    const val MODEL_LLAMA_33 = "llama-3.3-70b-versatile"
    const val MODEL_MIXTRAL = "mixtral-8x7b-32768"

    private const val DEFAULT_SYSTEM_PROMPT =
        "You are an English teacher for Persian speakers. " +
        "Answer questions about English grammar, vocabulary, and pronunciation. " +
        "Keep answers short, friendly, and helpful. " +
        "You can use Persian to explain. " +
        "Always provide clear examples when teaching grammar."

    // 🔑 کلید API
    var apiKey: String = ""

    // مدل انتخابی (از تنظیمات)
    var model: String = MODEL_LLAMA_31

    // دمای پاسخ (خلاقیت) - از تنظیمات
    var temperature: Float = 0.7f

    // =========================================================
    // ⚙️ لیست پیکربندی‌های ممکن (به ترتیب اولویت چک میشن)
    // =========================================================
    private val possibleConfigs = listOf(
        ProxyConfig("بدون پروکسی (VPN معمولی)", useProxy = false),
        ProxyConfig("V2RayNG (HTTP)", useProxy = true, type = Proxy.Type.HTTP, port = 10808),
        ProxyConfig("Clash / Hiddify (HTTP)", useProxy = true, type = Proxy.Type.HTTP, port = 7890),
        ProxyConfig("NekoBox / Sing-box (HTTP)", useProxy = true, type = Proxy.Type.HTTP, port = 2080),
        ProxyConfig("V2RayNG (SOCKS)", useProxy = true, type = Proxy.Type.SOCKS, port = 10808),
        ProxyConfig("Clash (SOCKS)", useProxy = true, type = Proxy.Type.SOCKS, port = 7890)
    )

    // پیکربندی فعال (بعد از تشخیص خودکار پر میشه)
    private var activeConfig: ProxyConfig? = null
    private var activeApi: GroqApi? = null

    // =========================================================
    // 🧠 تابع هوشمند تشخیص پروکسی
    // =========================================================
    suspend fun autoDetectProxy() = withContext(Dispatchers.IO) {
        // اگر قبلاً پیدا شده، دوباره تست نکن
        if (activeApi != null) return@withContext

        for (config in possibleConfigs) {
            try {
                val testClient = buildClient(config, timeoutSeconds = 4) // تایم‌اوت کوتاه برای تست
                val testApi = buildApi(testClient)
                
                // یک درخواست ساده برای تست اتصال
                testApi.chatCompletion(
                    auth = "Bearer $apiKey",
                    request = ChatRequest(model, listOf(ChatMessage("user", "Hi")), maxTokens = 5)
                )
                
                // اگر به اینجا رسید، یعنی اتصال برقرار شد!
                activeConfig = config
                activeApi = testApi
                println("✅ پروکسی موفق پیدا شد: ${config.name}")
                return@withContext
                
            } catch (e: Exception) {
                // این پیکربندی کار نکرد، برو سراغ بعدی
                println("❌ پیکربندی ${config.name} کار نکرد: ${e.message}")
            }
        }
        
        // اگر هیچکدوم کار نکرد، مقدار پیش‌فرض رو بذار
        activeConfig = possibleConfigs[0]
        activeApi = buildApi(buildClient(activeConfig!!, 30))
    }

    // =========================================================
    // توابع کمکی برای ساخت Client و Api
    // =========================================================
    private fun buildClient(config: ProxyConfig, timeoutSeconds: Long): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .connectTimeout(timeoutSeconds, TimeUnit.SECONDS)
            .readTimeout(timeoutSeconds, TimeUnit.SECONDS)
            .writeTimeout(timeoutSeconds, TimeUnit.SECONDS)

        if (config.useProxy) {
            val proxy = Proxy(config.type, InetSocketAddress(config.host, config.port))
            builder.proxy(proxy)
        }
        return builder.build()
    }

    private fun buildApi(client: OkHttpClient): GroqApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GroqApi::class.java)
    }

    // =========================================================
    // تابع اصلی ارسال پیام
    // =========================================================
    suspend fun askAI(
        userMessage: String,
        history: List<ChatMessage> = emptyList(),
        systemPrompt: String = DEFAULT_SYSTEM_PROMPT
    ): String {
        if (apiKey.isEmpty()) {
            return "❌ کلید API تنظیم نشده است.\n\nلطفاً از تنظیمات، یک کلید رایگان از console.groq.com وارد کنید."
        }

        // اگر هنوز پروکسی تشخیص داده نشده، اول اون رو انجام بده
        if (activeApi == null) {
            autoDetectProxy()
        }

        val system = ChatMessage(role = "system", content = systemPrompt)
        val allMessages = listOf(system) + history + ChatMessage(role = "user", content = userMessage)

        val request = ChatRequest(
            model = model,
            messages = allMessages,
            temperature = temperature,
            maxTokens = 1024
        )

        return try {
            val response = activeApi?.chatCompletion(
                auth = "Bearer $apiKey",
                request = request
            )
            response?.choices?.firstOrNull()?.message?.content
                ?: "متأسفانه پاسخی دریافت نشد."
        } catch (e: Exception) {
            // اگر در حین ارسال پیام خطا داد، یکبار دیگه پروکسی رو ریست کن و دوباره تلاش کن
            activeApi = null
            activeConfig = null
            
            val errorMsg = e.message ?: "خطای نامشخص"
            when {
                errorMsg.contains("401") || errorMsg.contains("Unauthorized") ->
                    "❌ کلید API نامعتبر است. لطفاً از تنظیمات، کلید صحیح را وارد کنید."
                errorMsg.contains("429") ->
                    "⏳ تعداد درخواست‌ها زیاد شده. چند لحظه صبر کن و دوباره امتحان کن."
                errorMsg.contains("timeout") || errorMsg.contains("Unable to resolve host") ->
                    "🌐 اتصال به اینترنت برقرار نیست. اتصال VPN خود را بررسی کنید."
                errorMsg.contains("Failed to connect") || errorMsg.contains("Connection refused") -> 
                    "🔌 اتصال برقرار نشد! لطفاً مطمئن شوید VPN روشن است و دوباره تلاش کنید."
                else ->
                    "خطا در ارتباط با AI: $errorMsg"
            }
        }
    }

    // تابع تست دستی کلید (از تنظیمات)
    suspend fun testApiKey(): Boolean {
        if (apiKey.isEmpty()) return false
        activeApi = null // ریست کردن برای تست مجدد
        autoDetectProxy()
        
        return try {
            val response = activeApi?.chatCompletion(
                auth = "Bearer $apiKey",
                request = ChatRequest(model, listOf(ChatMessage("user", "Hi")), maxTokens = 5)
            )
            response?.choices?.isNotEmpty() == true
        } catch (e: Exception) {
            false
        }
    }
}