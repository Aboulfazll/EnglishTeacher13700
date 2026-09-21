package com.example.englishteacher.data

import com.google.gson.annotations.SerializedName
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Url

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

// ============ Client ============
object GroqClient {
    private const val BASE_URL = "https://api.groq.com/"

    // مدل‌های موجود
    const val MODEL_LLAMA_31 = "llama-3.1-8b-instant"
    const val MODEL_LLAMA_33 = "llama-3.3-70b-versatile"
    const val MODEL_MIXTRAL = "mixtral-8x7b-32768"

    // 🔑 کلید API
    var apiKey: String = ""

    // مدل انتخابی (از تنظیمات)
    var model: String = MODEL_LLAMA_31

    // دمای پاسخ (خلاقیت) - از تنظیمات
    var temperature: Float = 0.7f

    private val api: GroqApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GroqApi::class.java)
    }

    /**
     * ارسال سوال به AI و دریافت پاسخ
     */
    suspend fun askAI(
        userMessage: String,
        history: List<ChatMessage> = emptyList(),
        systemPrompt: String = DEFAULT_SYSTEM_PROMPT
    ): String {
        if (apiKey.isEmpty()) {
            return "❌ کلید API تنظیم نشده است.\n\nلطفاً از تنظیمات، یک کلید رایگان از console.groq.com وارد کنید."
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
            val response = api.chatCompletion(
                auth = "Bearer $apiKey",
                request = request
            )
            response.choices.firstOrNull()?.message?.content
                ?: "متأسفانه پاسخی دریافت نشد."
        } catch (e: Exception) {
            val errorMsg = e.message ?: "خطای نامشخص"
            when {
                errorMsg.contains("401") || errorMsg.contains("Unauthorized") ->
                    "❌ کلید API نامعتبر است. لطفاً از تنظیمات، کلید صحیح را وارد کنید."
                errorMsg.contains("429") ->
                    "⏳ تعداد درخواست‌ها زیاد شده. چند لحظه صبر کن و دوباره امتحان کن."
                errorMsg.contains("timeout") || errorMsg.contains("Unable to resolve host") ->
                    "🌐 اتصال به اینترنت برقرار نیست. اتصالت رو چک کن."
                errorMsg.contains("model") ->
                    "🤖 مدل انتخابی در دسترس نیست. از تنظیمات مدل دیگری انتخاب کن."
                else ->
                    "خطا در ارتباط با AI: $errorMsg"
            }
        }
    }

    /**
     * چک کردن معتبر بودن کلید API
     */
    suspend fun testApiKey(): Boolean {
        if (apiKey.isEmpty()) return false
        return try {
            val response = api.chatCompletion(
                auth = "Bearer $apiKey",
                request = ChatRequest(
                    model = model,
                    messages = listOf(ChatMessage("user", "Hi")),
                    temperature = 0.1f,
                    maxTokens = 5
                )
            )
            response.choices.isNotEmpty()
        } catch (e: Exception) {
            false
        }
    }

    companion object {
        private const val DEFAULT_SYSTEM_PROMPT =
            "You are an English teacher for Persian speakers. " +
            "Answer questions about English grammar, vocabulary, and pronunciation. " +
            "Keep answers short, friendly, and helpful. " +
            "You can use Persian to explain. " +
            "Always provide clear examples when teaching grammar."
    }
}