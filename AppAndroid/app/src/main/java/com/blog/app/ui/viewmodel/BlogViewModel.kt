package com.blog.app.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blog.app.domain.GetBlog
import com.blog.app.domain.GetBlogs
import com.blog.app.domain.model.Blog
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlogViewModel @Inject constructor(
    private val getBlogs: GetBlogs,
    private val getBlogCseuse: GetBlog
) : ViewModel() {

    val blogList = MutableLiveData<List<Blog>>()
    val blog = MutableLiveData<Blog>()
    val tituloCheck = MutableLiveData<Boolean>()
    val autorCheck = MutableLiveData<Boolean>()
    val contenidoCheck = MutableLiveData<Boolean>()


    suspend fun getAllBlog() {
        viewModelScope.launch {
            val response = getBlogs()
            blogList.postValue(response)
        }
    }

    suspend fun initCheck(tituloch: Boolean, autorch: Boolean, contenidoch: Boolean) {
        viewModelScope.launch {
            tituloCheck.postValue(tituloch)
            autorCheck.postValue(autorch)
            contenidoCheck.postValue(contenidoch)
        }
    }

    suspend fun getBlog(id: String) {
        viewModelScope.launch {
            val response = getBlogCseuse(id)
            blog.postValue(response)

        }
    }


}