package com.jama.dagger2inandroid.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity (
    @PrimaryKey
    val id:Int,
    val name:String,
    val phone:String
)