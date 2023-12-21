package com.blog.app.data.model

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.blog.app.databinding.ItemBlogBinding

class BlogViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemBlogBinding.bind(view)

    fun bind(blog: BlogModel) {
        binding.tvTitulo.text = blog.titulo
        binding.tvAutor.text = blog.autor
        binding.tvFecha.text = blog.fecha
        binding.tvContenido.text = blog.contenido
    }

}
