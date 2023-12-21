package com.blog.app.data.model

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blog.app.R
import com.blog.app.domain.model.Blog

class BlogAdapter(private val blogList:List<Blog>,private val onClickListener: (Blog)->Unit):RecyclerView.Adapter<BlogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val layoutInflater =LayoutInflater.from(parent.context)
        return  BlogViewHolder(layoutInflater.inflate(R.layout.item_blog,parent,false))
    }



    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val item=blogList[position]
        holder.bind(item,onClickListener)
    }


    override fun getItemCount(): Int=blogList.size
}