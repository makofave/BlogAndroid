package com.blog.app.data.model

import com.blog.app.data.database.entities.BlogEntity
import com.blog.app.domain.model.Blog
import com.google.gson.annotations.SerializedName

data class BlogModel(
    @SerializedName("titulo") val titulo: String,
    @SerializedName("autor") val autor: String,
    @SerializedName("fecha") val fecha: String,
    @SerializedName("contenido") val contenido: String
)


fun Blog.toModel() = BlogModel(
    titulo = titulo,
    autor = autor,
    fecha = fecha,
    contenido = contenido
)