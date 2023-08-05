package com.jama.dagger2inandroid.vm

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jama.dagger2inandroid.repository.UserRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) :ViewModel() {
    val TAG = "UserViewModel"
    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            userRepository.getUsers().forEach {
                Log.d(TAG, "fetchUsers: ${it.email}")
            }
        }
    }
}