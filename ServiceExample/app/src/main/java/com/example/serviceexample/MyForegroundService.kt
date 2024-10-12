package com.example.serviceexample

import android.R
import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MyForegroundService: Service() {

    private val TAG = "MyForegroundService"
    private val serviceJob = Job()
    private val serviceScope = CoroutineScope(Dispatchers.IO + serviceJob)

    @SuppressLint("ForegroundServiceType")
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d(TAG, "Foreground Service Started")

        // Launching a coroutine to perform background work
        serviceScope.launch {
            for (i in 1..50) {
                Log.d(TAG, "Foreground Service running... $i")
                delay(1000L) // Simulating some background work
            }
            // Stop the service after completing the task
            stopSelf()
        }

        val CHANNELID = "ForegroundServiceChannel"
        val channel = NotificationChannel(
            CHANNELID,
            "Foreground Service Channel",
            NotificationManager.IMPORTANCE_LOW
        )

        // Register the notification channel
        getSystemService(NotificationManager::class.java).createNotificationChannel(channel)

        // Use NotificationCompat.Builder for compatibility
        val notification: Notification = NotificationCompat.Builder(this, CHANNELID)
            .setContentTitle("Service enabled")
            .setContentText("Service is running")
            .setSmallIcon(R.drawable.ic_btn_speak_now) // Make sure the icon exists
            .build()

        // Start the service in the foreground
        startForeground(1001, notification)

        return super.onStartCommand(intent, flags, startId);
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null // Not using a bound service
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Foreground Service Destroyed")
        serviceJob.cancel() // Cancel the coroutine scope
    }
}