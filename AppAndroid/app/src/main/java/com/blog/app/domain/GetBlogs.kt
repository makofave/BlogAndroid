package com.blog.app.domain

import com.blog.app.data.BlogRepository
import com.blog.app.data.database.entities.toDatabase
import com.blog.app.domain.model.Blog
import javax.inject.Inject

class GetBlogs @Inject constructor(
    private val blogRepository: BlogRepository
) {

    suspend operator fun invoke():List<Blog>{
       /* val blogListDatabase=blogRepository.getListBLogFromDatabase()
        val blogProvider=blogRepository.getListBlogProvider()

        if (blogProvider.size>blogListDatabase.size){
            blogRepository.deleteBlogs()
            blogRepository.insertAllToDatabase(blogProvider.map { it.toDatabase()})
        }*/
        val blogApi=blogRepository.getListBlogFromAPI()
        blogRepository.deleteBlogs()
        blogRepository.insertAllToDatabase(blogApi.map { it.toDatabase()})



        return blogRepository.getListBLogFromDatabase()
    }
}