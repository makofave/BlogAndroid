package com.blog.app.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blog.app.data.model.BlogModel
import com.blog.app.data.model.BlogProvider
import com.blog.app.domain.GetBlog
import com.blog.app.domain.model.Blog
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlogViewModel @Inject constructor(
    private val blogProvider: BlogProvider,
    private val getBlog: GetBlog
) : ViewModel() {

    val blogList = MutableLiveData<List<Blog>>()


    suspend fun getAllBlog() {
        viewModelScope.launch {
            val response = getBlog()
            blogList.postValue(response)
        }
    }


}