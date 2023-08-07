package com.jama.dagger2inandroid.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jama.dagger2inandroid.database.dao.UserDao
import com.jama.dagger2inandroid.database.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getUserDao():UserDao
}