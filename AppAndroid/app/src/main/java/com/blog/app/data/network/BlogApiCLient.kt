package com.blog.app.data.network

import com.blog.app.data.model.BlogModel
import com.blog.app.data.model.ResponseClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.Headers
import retrofit2.http.POST

interface BlogApiCLient {
    @GET("/Blogs")
    suspend fun getAllBLogs():Response<List<BlogModel>>

    @Headers("Content-Type: application/json")
    @POST("/Blog")
    suspend fun insertBlog(@Body blogModel: BlogModel): Response<BlogModel>

    @Headers("Content-Type: application/json")
    @POST("/Blog")
    suspend fun getCountLis(): Response<String>

}