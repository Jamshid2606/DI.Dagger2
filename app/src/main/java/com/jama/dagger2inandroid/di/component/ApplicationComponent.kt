package com.jama.dagger2inandroid.di.component

import com.jama.dagger2inandroid.MainActivity
import com.jama.dagger2inandroid.di.module.DatabaseModule
import com.jama.dagger2inandroid.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class, DatabaseModule::class])
@Singleton
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}