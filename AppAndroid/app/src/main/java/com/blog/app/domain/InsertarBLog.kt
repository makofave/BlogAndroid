package com.blog.app.domain

import com.blog.app.data.BlogRepository
import com.blog.app.domain.model.Blog
import javax.inject.Inject

class InsertarBLog @Inject constructor(
    private val blogRepository: BlogRepository
) {

    suspend operator fun invoke(blog:Blog){
        //blogRepository.insertBlogtoAPI(blog)
    }
}