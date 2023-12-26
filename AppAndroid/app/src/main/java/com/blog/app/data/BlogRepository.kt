package com.blog.app.data

import com.blog.app.data.database.dao.BlogDao
import com.blog.app.data.database.entities.BlogEntity
import com.blog.app.data.model.BlogModel
import com.blog.app.data.model.BlogProvider
import com.blog.app.data.model.toModel
import com.blog.app.data.network.BlogService
import com.blog.app.domain.model.Blog
import com.blog.app.domain.model.toDomain
import javax.inject.Inject

class BlogRepository @Inject constructor(
    private val blogProvider: BlogProvider,
    private val blogDao: BlogDao,
    private val api: BlogService
){

    suspend fun  getListBlogProvider():List<Blog>{
        val response:List<BlogModel> =blogProvider.blogs
        return response.map { it.toDomain() }
    }

    suspend fun getListBlogFromAPI():List<Blog>{
        val response:List<BlogModel> = api.getBlogs()
        return response.map { it.toDomain() }
    }

    suspend fun getListBLogFromDatabase(): List<Blog>{
        val response:List<BlogEntity> = blogDao.getAllBlog()
        return response.map { it.toDomain() }
    }

    suspend fun getCountFromAPi():Int{
        val response =api.getCount()
        return  response
    }

    suspend fun insertAllToDatabase(blogs:List<BlogEntity>){
        blogDao.insertAll(blogs)
    }

    suspend fun deleteBlogs(){
        blogDao.deleteAllBlogs()
    }

    suspend fun getBLogFromDatabase(id:String):Blog{
        return blogDao.searchBlog(id).toDomain()
    }

    suspend fun insertBlogtoAPI(blog:Blog):String{
        return api.insertBlog(blog)


    }


}