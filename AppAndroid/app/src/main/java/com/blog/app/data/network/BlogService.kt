package com.blog.app.data.network

import android.util.Log
import android.widget.Toast
import com.blog.app.core.RetrofitHelper
import com.blog.app.data.model.BlogModel
import com.blog.app.data.model.ResponseClass
import com.blog.app.data.model.toModel
import com.blog.app.domain.model.Blog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException
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

    suspend fun insertBlog(blog: Blog): String {
        return withContext(Dispatchers.IO) {

            val response = api.insertBlog(blog.toModel())
            Log.i("retrofit", response.message() ?: "no encontro")
            response.message() ?: ""
        }
    }

    suspend fun getCount(): Int {
        return withContext(Dispatchers.IO) {
            val response = api.getCountLis()

            response.body()?.toInt() ?:0
        }
    }


}