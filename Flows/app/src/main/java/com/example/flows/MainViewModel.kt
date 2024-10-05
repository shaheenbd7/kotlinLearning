package com.example.flows

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    companion object {
        private const val TAG = "SHAN"
    }



    val countdownFlow = flow<Int> {
        val startingValue = 10
        var currentValue = startingValue
        emit(startingValue)
        while(currentValue > 0) {
            delay(1000L)
            currentValue--
            emit(currentValue)
        }

    }

    init {
        collectFlow()
    }


    private fun collectFlow() {
        viewModelScope.launch {
            countdownFlow.collect{ time ->
                Log.i(TAG, "collectFlow: ")
                println("shan The current time is $time")
            }
        }
    }
}