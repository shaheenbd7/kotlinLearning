package com.example.hilt_example_1.hilt

import com.example.hilt_example_1.network.MyAppNetworkAdapter
import com.example.hilt_example_1.network.NetworkAdapter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class NetworkModule {

    @Binds
    abstract fun BindNetworkAdapterImpl(networkAdapterImpl: MyAppNetworkAdapter): NetworkAdapter
}