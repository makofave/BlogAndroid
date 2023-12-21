package com.blog.app.domain

import com.blog.app.data.BlogRepository
import com.blog.app.data.database.entities.toDatabase
import com.blog.app.domain.model.Blog
import javax.inject.Inject

class GetBlog @Inject constructor(
    private val blogRepository: BlogRepository
) {

    suspend operator fun invoke():List<Blog>{
        val blogListDatabase=blogRepository.getListBLogFromDatabase()
        val blogProvider=blogRepository.getListBlogProvider()

        if(blogListDatabase.isEmpty()){
            blogRepository.insertAll(blogProvider.map { it.toDatabase()})
        }
        return blogRepository.getListBLogFromDatabase()
    }
}