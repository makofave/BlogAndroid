package com.blog.app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.blog.app.data.database.dao.BlogDao
import com.blog.app.data.database.entities.BlogEntity

@Database(entities = [BlogEntity::class], version = 1)
abstract class BlogDatabase:RoomDatabase() {
    abstract fun getBlogDao():BlogDao
}