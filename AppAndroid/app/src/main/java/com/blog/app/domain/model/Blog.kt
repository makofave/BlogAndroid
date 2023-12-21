package com.blog.app.domain.model

import com.blog.app.data.database.entities.BlogEntity
import com.blog.app.data.model.BlogModel

data class Blog(val id:Int,val titulo: String, val autor: String, val fecha: String, val contenido: String)


fun BlogModel.toDomain() = Blog(0,
    titulo = titulo,
    autor = autor,
    fecha = fecha,
    contenido = contenido
)

fun BlogEntity.toDomain() = Blog(id=id,
    titulo = titulo,
    autor = autor,
    fecha = fecha,
    contenido = contenido
)