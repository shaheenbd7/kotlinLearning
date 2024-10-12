package com.example.serviceexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MyService: Service() {

    private val TAG = "MyService"
    private val serviceJob = Job()
    private val serviceScope = CoroutineScope(Dispatchers.IO + serviceJob)

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "Service Started")

        // Launching a coroutine to perform background work
        serviceScope.launch {
            for (i in 1..5) {
                Log.d(TAG, "Service running... $i")
                delay(1000L) // Simulating some background work
            }
            // Stop the service after completing the task
            stopSelf()
        }

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Service Destroyed")
        serviceJob.cancel() // Cancel any running coroutine jobs when service is destroyed
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null // Not using a bound service
    }
}