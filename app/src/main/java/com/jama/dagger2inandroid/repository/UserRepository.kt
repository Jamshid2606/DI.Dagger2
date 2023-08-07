package com.jama.dagger2inandroid.repository

import com.jama.dagger2inandroid.database.dao.UserDao
import com.jama.dagger2inandroid.networking.ApiService
import javax.inject.Inject

class UserRepository @Inject constructor(private var apiService: ApiService, private var userDao: UserDao) {
    suspend fun getUsers() = apiService.getUsers()

}