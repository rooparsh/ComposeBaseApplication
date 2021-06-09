package com.darklabs.data.di

import com.darklabs.data.BuildConfig
import com.darklabs.data.remote.NetworkHelper
import com.darklabs.data.remote.api.JokeApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    @JvmStatic
    fun provideHttpClient(): OkHttpClient = NetworkHelper.createOkHttpClient()

    @ExperimentalSerializationApi
    @Provides
    @Singleton
    @JvmStatic
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        NetworkHelper.createRetrofitClient(okHttpClient, BuildConfig.BASE_URL)

    @Provides
    @Singleton
    @JvmStatic
    fun provideJokesApiService(retrofit: Retrofit): JokeApiService {
        return retrofit.create(JokeApiService::class.java)
    }
}