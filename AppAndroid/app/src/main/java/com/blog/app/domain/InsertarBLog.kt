package com.blog.app.domain

import android.util.Log
import com.blog.app.data.BlogRepository
import com.blog.app.domain.model.Blog
import javax.inject.Inject

class InsertarBLog @Inject constructor(
    private val blogRepository: BlogRepository
) {

    suspend operator fun invoke(blog: Blog):Boolean{

        try{
            blogRepository.insertBlogtoAPI(blog)
            return true;
        }catch (e:Exception){
            Log.i("ERROR RETRO","$e")
            return false
        }finally {

        }

    }
}