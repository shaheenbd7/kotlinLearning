package com.example.jetpackcompose.model

import kotlin.reflect.KClass

enum class MyDataType(val messagePath: String, val isMine: Boolean = false) {
    MY_ACCELEROMETER("/accelerometer_data", true),
    MY_BP("/bp_data")

    companion object {
        fun fromModel(model: KClass<*>) = when (model) {
            Accelerometer::class -> MY_ACCELEROMETER
            BP::class -> MY_BP
        }
    }
}