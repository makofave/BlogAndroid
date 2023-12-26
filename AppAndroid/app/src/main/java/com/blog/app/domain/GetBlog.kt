package com.blog.app.domain

import android.util.Log
import com.blog.app.data.BlogRepository
import com.blog.app.domain.model.Blog
import javax.inject.Inject

class GetBlog @Inject constructor(
    private val blogRepository: BlogRepository
) {


    suspend operator fun invoke(id: String): Blog {

        val blog = blogRepository.getBLogFromDatabase(id)
        return blog

    }
}