package com.blog.app.data.network

import com.blog.app.data.model.BlogModel
import retrofit2.http.GET
import retrofit2.Response

interface BlogApiCLient {
    @GET("/")
    suspend fun getAllBLogs():Response<List<BlogModel>>
}