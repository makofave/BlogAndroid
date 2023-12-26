package com.blog.app.domain

import android.util.Log
import android.widget.Toast
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
        try {

            //verificamos si tenemos conexion a INTERNET
            if(untilsNetwork.invoke()){
                //guardamos la info d emanera local.
                val blogApi=blogRepository.getListBlogFromAPI()
                blogRepository.deleteBlogs()
                blogRepository.insertAllToDatabase(blogApi.map { it.toDatabase()})
            }
        }catch (e:Exception){
            Log.i("Error Retrofit","Error $e")
        }finally {
            //siempre obtenemos las listas desde labase local.
            return blogRepository.getListBLogFromDatabase()
        }

    }
}