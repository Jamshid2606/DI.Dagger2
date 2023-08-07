package com.jama.dagger2inandroid.di.module

import android.content.Context
import androidx.room.Room
import com.jama.dagger2inandroid.database.AppDatabase
import com.jama.dagger2inandroid.database.dao.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule(var context: Context) {
    @Provides
    @Singleton
    fun provideContext():Context = context

    @Provides
    @Singleton
    fun provideAppDatabase(context: Context):AppDatabase{
        return Room.databaseBuilder(context=context, klass = AppDatabase::class.java, "my_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase):UserDao{
        return appDatabase.getUserDao()
    }
}