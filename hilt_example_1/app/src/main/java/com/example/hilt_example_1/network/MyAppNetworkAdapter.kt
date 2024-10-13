package com.example.hilt_example_1.network

import android.util.Log
import javax.inject.Inject

class MyAppNetworkAdapter @Inject constructor(): NetworkAdapter{

    override fun log(message: String) {
        Log.d(TAG, "MyAppNetworkAdapter message = $message")
    }

    companion object {
        private val TAG = this::class.simpleName
    }
}