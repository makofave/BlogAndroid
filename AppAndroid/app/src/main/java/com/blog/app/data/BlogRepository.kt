package com.blog.app.data

import com.blog.app.data.database.dao.BlogDao
import com.blog.app.data.database.entities.BlogEntity
import com.blog.app.data.model.BlogModel
import com.blog.app.data.model.BlogProvider
import com.blog.app.domain.model.Blog
import com.blog.app.domain.model.toDomain
import javax.inject.Inject

class BlogRepository @Inject constructor(
    private val blogProvider: BlogProvider,
    private val blogDao: BlogDao
){

    suspend fun  getListBlogProvider():List<Blog>{
        val response:List<BlogModel> =blogProvider.blogs
        return response.map { it.toDomain() }
    }

    suspend fun getListBLogFromDatabase(): List<Blog>{
        val response:List<BlogEntity> = blogDao.getAllBlog()
        return response.map { it.toDomain() }
    }

    suspend fun insertAll(blogs:List<BlogEntity>){
        blogDao.insertAll(blogs)
    }

    suspend fun deleteBlogs(){
        blogDao.deleteAllBlogs()
    }


}