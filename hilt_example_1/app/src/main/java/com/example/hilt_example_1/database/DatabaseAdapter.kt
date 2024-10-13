package com.example.hilt_example_1.database

import android.util.Log
import com.example.hilt_example_1.TAG
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(private val databaseService: DatabaseService) {
    fun log(message: String) {
        Log.d(TAG, "log: DatabaseAdapter = $message")
        databaseService.log(message)
    }
}