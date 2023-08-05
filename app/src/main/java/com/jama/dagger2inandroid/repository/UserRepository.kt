package com.jama.dagger2inandroid.repository

import com.jama.dagger2inandroid.networking.ApiService
import javax.inject.Inject

class UserRepository @Inject constructor(private var apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}