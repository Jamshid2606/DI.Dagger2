package com.jama.dagger2inandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jama.dagger2inandroid.databinding.ActivityMainBinding
import com.jama.dagger2inandroid.vm.UserViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var userViewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        App.applicationComponent.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}