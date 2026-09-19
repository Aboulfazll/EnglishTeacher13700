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
    @SerializedName("messages") val messages: List<ChatMessage>
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
    private const val MODEL = "llama-3.1-8b-instant"

    // 🔑 کلید API خودت رو اینجا بذار (از console.groq.com)
    var apiKey: String = ""

    private val api: GroqApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GroqApi::class.java)
    }

    suspend fun askAI(
        userMessage: String,
        history: List<ChatMessage> = emptyList()
    ): String {
        if (apiKey.isEmpty()) {
            return "❌ کلید API تنظیم نشده است.\n\nلطفاً از console.groq.com یه کلید رایگان بگیر و توی کد GroqApi.kt وارد کن."
        }

        val systemPrompt = ChatMessage(
            role = "system",
            content = "You are an English teacher for Persian speakers. Answer questions about English grammar, vocabulary, and pronunciation. Keep answers short, friendly, and helpful. You can use Persian to explain."
        )

        val allMessages = listOf(systemPrompt) + history + ChatMessage(role = "user", content = userMessage)

        val request = ChatRequest(
            model = MODEL,
            messages = allMessages
        )

        return try {
            val response = api.chatCompletion(
                auth = "Bearer $apiKey",
                request = request
            )
            response.choices.firstOrNull()?.message?.content
                ?: "متأسفانه پاسخی دریافت نشد."
        } catch (e: Exception) {
            "خطا در ارتباط با AI: ${e.message}"
        }
    }
}