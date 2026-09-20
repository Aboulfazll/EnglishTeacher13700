package com.example.englishteacher

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat

object NotificationHelper {

    private const val CHANNEL_ID = "english_teacher_daily"
    private const val CHANNEL_NAME = "یادآوری روزانه"
    private const val NOTIFICATION_ID = 1001

    fun createNotificationChannel(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "یادآوری برای یادگیری روزانه انگلیسی"
            }
            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

    fun showDailyReminder(context: Context) {
        val messages = listOf(
            "وقت یادگیری انگلیسیه! 📚",
            "امروز چند لغت جدید یاد بگیر! 🌟",
            "استریکت رو حفظ کن! 🔥",
            "یه درس کوتاه بخون، عالیه! ✨",
            "English time! یادگیری رو ادامه بده 💪"
        )
        val message = messages.random()

        // گرفتن لانچر اینتنت از package manager (امن‌تر و انعطاف‌پذیرتر)
        val launchIntent = context.packageManager
            .getLaunchIntentForPackage(context.packageName)

        val pendingIntent = if (launchIntent != null) {
            launchIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            PendingIntent.getActivity(
                context,
                0,
                launchIntent,
                PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
            )
        } else null

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle("English Teacher")
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)

        if (pendingIntent != null) {
            builder.setContentIntent(pendingIntent)
        }

        val notification = builder.build()

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(NOTIFICATION_ID, notification)
    }
}