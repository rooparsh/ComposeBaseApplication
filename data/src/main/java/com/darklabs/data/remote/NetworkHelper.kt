package com.darklabs.data.remote

import com.darklabs.data.BuildConfig
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

object NetworkHelper {

    private val contentType = "application/json".toMediaType()

    private val okHttpLoggingInterceptor by lazy {
        HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }
    }

    fun createOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(okHttpLoggingInterceptor)
            .build()
    }

    @ExperimentalSerializationApi
    fun createRetrofitClient(
        okHttpClient: OkHttpClient,
        baseUrl: String
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .client(okHttpClient)
            .build()
    }
}