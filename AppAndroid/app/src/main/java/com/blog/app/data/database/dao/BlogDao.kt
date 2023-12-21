package com.blog.app.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.blog.app.data.database.entities.BlogEntity

@Dao
interface BlogDao {

    @Query("SELECT * FROM blog_table")
    suspend fun getAllBlog():List<BlogEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(blogs:List<BlogEntity>)

    @Query("Delete from BLOG_TABLE")
    suspend fun deleteAllBlogs()

    @Query("SELECT * FROM blog_table WHERE " +
            "titulo LIKE:search " +
            "OR autor LIKE:search " +
            "OR contenido LIKE:search")
    suspend fun searBlogs(search:String):List<BlogEntity>

}