package com.blog.app.data.network

import com.blog.app.core.RetrofitHelper
import com.blog.app.data.model.BlogModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class BlogService @Inject constructor(
    private val api: BlogApiCLient
) {

    suspend fun getBlogs(): List<BlogModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllBLogs()
            response.body() ?: emptyList()
        }

    }
}