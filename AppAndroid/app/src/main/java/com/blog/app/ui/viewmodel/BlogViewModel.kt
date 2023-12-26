package com.blog.app.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blog.app.data.network.UntilsNetwork
import com.blog.app.domain.GetBlog
import com.blog.app.domain.GetBlogs
import com.blog.app.domain.InsertarBLog
import com.blog.app.domain.model.Blog
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlogViewModel @Inject constructor(
    private val getBlogs: GetBlogs,
    private val getBlogCseuse: GetBlog,
    private val insertarBLog: InsertarBLog,
    private val untilsNetwork: UntilsNetwork
) : ViewModel() {

    val blogList = MutableLiveData<List<Blog>>()
    val blog = MutableLiveData<Blog>()
    val isLoading = MutableLiveData<Boolean>()
    val isNetwork = MutableLiveData<Boolean>()
    val isSave=MutableLiveData<Boolean>()


    suspend fun getAllBlog() {
        viewModelScope.launch {

            //ponemos el loading en la pantalla
            isLoading.postValue(true)
            //verificamos si hay conexion a internet
            isNetwork.postValue(untilsNetwork.invoke())
            val response = getBlogs()
            if (!response.isNullOrEmpty())
                blogList.postValue(response)

            isLoading.postValue(false)

        }
    }

    suspend fun getBlog(id: String) {
        viewModelScope.launch {
            val response = getBlogCseuse(id)
            blog.postValue(response)
        }
    }

    suspend fun insertBlog(blog: Blog) {
        viewModelScope.launch {
            //ponemos el loading en la pantalla
            isLoading.postValue(true)
            //verificamos si hay conexion a internet
            isNetwork.postValue(untilsNetwork.invoke())

            if (insertarBLog(blog))
            {
                isSave.postValue(true)
            }else{
                isSave.postValue(false)
            }


            isLoading.postValue(false)
        }
    }


}