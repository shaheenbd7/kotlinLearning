package com.example.hilt_example_1.network

import android.util.Log
import com.example.hilt_example_1.TAG

class NetworkService private constructor(builder: Builder) {

    val protocol: String?
    val host: String?
    val path: String?
    val interceptor: Interceptor?

    init {
        this.protocol = builder.protocol
        this.host = builder.host
        this.path = builder.path
        this.interceptor = builder.interceptor
    }

    fun performNetworkCall() {
        interceptor?.log("call performed")
        Log.d(TAG, "performNetworkCall: $this")
    }

    class Builder {
        var protocol: String? = null
            private set
        var host: String? = null
            private set
        var path: String? = null
            private set
        var interceptor: Interceptor? = null
            private set

        fun protocol(protocol: String) = apply { this.protocol = protocol }
        fun host(host: String) = apply { this.host = host }
        fun path(path: String) = apply { this.path = path }
        fun interceptor(interceptor: Interceptor) = apply { this.interceptor = interceptor }
    }
}