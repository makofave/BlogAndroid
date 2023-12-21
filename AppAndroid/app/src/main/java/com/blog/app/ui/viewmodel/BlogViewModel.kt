package com.blog.app.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blog.app.data.model.BlogModel
import com.blog.app.data.model.BlogProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlogViewModel @Inject constructor(
    private val blogProvider: BlogProvider
) : ViewModel() {

    val blogList=MutableLiveData<List<BlogModel>>()


    suspend fun getAllBlog(){
        viewModelScope.launch {
            val response=blogProvider.blogs
            blogList.postValue(response)
        }
    }


}