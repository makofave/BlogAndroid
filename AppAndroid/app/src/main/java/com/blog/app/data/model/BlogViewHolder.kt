package com.blog.app.data.model

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.blog.app.databinding.ItemBlogBinding
import com.blog.app.domain.model.Blog

class BlogViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemBlogBinding.bind(view)

    fun bind(blog: Blog, onClickListener: (Blog)->Unit) {
        binding.tvTitulo.text = blog.titulo
        binding.tvAutor.text = blog.autor
        binding.tvFecha.text = blog.fecha
        binding.tvContenido.text = blog.contenido
        binding.cardBlog.setOnClickListener {onClickListener(blog)}
    }

}
