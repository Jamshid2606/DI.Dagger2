package com.jama.dagger2inandroid.di.component

import com.jama.dagger2inandroid.MainActivity
import com.jama.dagger2inandroid.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}