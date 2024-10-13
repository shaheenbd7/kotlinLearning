package com.example.hilt_example_1

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "SHAN"

@HiltAndroidApp
class HiltTutorialApplication: Application() {
}