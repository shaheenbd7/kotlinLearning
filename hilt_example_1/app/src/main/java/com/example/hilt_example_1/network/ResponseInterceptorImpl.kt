package com.example.hilt_example_1.network

import android.util.Log
import com.example.hilt_example_1.TAG
import javax.inject.Inject

class ResponseInterceptorImpl @Inject constructor() : Interceptor {
    override fun log(message: String) {
        Log.d(TAG, "log: This is a response Interceptor: $message")
    }
}