package com.blog.app.di

import android.content.Context
import android.net.ConnectivityManager
import com.blog.app.data.network.BlogApiCLient
import com.blog.app.data.network.UntilsNetwork
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("http://192.168.1.66/")
            //.baseUrl("http://192.168.1.75/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()!!

    }


    @Provides
    @Singleton
    fun provideBLogApiCLient(retrofit: Retrofit): BlogApiCLient {
        return retrofit.create(BlogApiCLient::class.java)
    }

    @Provides
    @Singleton
    fun provideConnectivityManager(@ApplicationContext context: Context): ConnectivityManager {
        return context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    @Provides
    @Singleton
    fun provUntilsNetwork(connectivityManager: ConnectivityManager): UntilsNetwork {
        return UntilsNetwork(connectivityManager)
    }
}