package com.jama.dagger2inandroid.networking

import com.jama.dagger2inandroid.models.UserData
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers():List<UserData>
}