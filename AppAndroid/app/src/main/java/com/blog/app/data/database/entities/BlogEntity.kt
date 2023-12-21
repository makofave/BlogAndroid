package com.blog.app.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.blog.app.domain.model.Blog

@Entity(tableName = "blog_table")
data class BlogEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "titulo") val titulo: String,
    @ColumnInfo(name = "autor") val autor: String,
    @ColumnInfo(name = "fecha") val fecha: String,
    @ColumnInfo(name = "contenido") val contenido: String
)

fun Blog.toDatabase()=BlogEntity(
    titulo=titulo,
    autor = autor,
    fecha = fecha,
    contenido = contenido
)