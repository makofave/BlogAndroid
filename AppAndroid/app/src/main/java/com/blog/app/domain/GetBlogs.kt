package com.blog.app.domain

import com.blog.app.data.BlogRepository
import com.blog.app.data.database.entities.toDatabase
import com.blog.app.data.network.UntilsNetwork
import com.blog.app.domain.model.Blog
import javax.inject.Inject

class GetBlogs @Inject constructor(
    private val blogRepository: BlogRepository,
    private val untilsNetwork: UntilsNetwork
) {

    suspend operator fun invoke():List<Blog>{

        //verificamos si tenemos conexion a INTERNET
        if(untilsNetwork.invoke()){
            val blogApi=blogRepository.getListBlogFromAPI()
            blogRepository.deleteBlogs()
            blogRepository.insertAllToDatabase(blogApi.map { it.toDatabase()})
        }




        return blogRepository.getListBLogFromDatabase()
    }
}