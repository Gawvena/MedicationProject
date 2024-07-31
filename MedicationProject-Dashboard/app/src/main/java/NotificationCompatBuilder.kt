package com.example.reminder_data_flair

import androidx.core.app.NotificationCompat

class NotificationCompatBuilder {
    var builder = NotificationCompat.Builder(this, CHANNEL_ID)
        .setSmallIcon(R.drawable.appicon)
        .setContentTitle(textTitle)
        .setContentText(textContent)
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
}