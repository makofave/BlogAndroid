package com.blog.app.di

import android.content.Context
import androidx.room.Room
import com.blog.app.data.database.BlogDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val BLOG_DATABASE_NAME = "blog_database"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, BlogDatabase::class.java, BLOG_DATABASE_NAME).build()


    @Singleton
    @Provides
    fun provideBlogDao(db:BlogDatabase)=db.getBlogDao()

}