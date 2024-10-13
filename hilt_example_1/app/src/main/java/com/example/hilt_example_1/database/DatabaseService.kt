package com.example.hilt_example_1.database

import android.util.Log
import com.example.hilt_example_1.TAG
import javax.inject.Inject

class DatabaseService @Inject constructor() {
    fun log(message: String) {
        Log.d(TAG, "log: DatabaseService: $message")
    }
}