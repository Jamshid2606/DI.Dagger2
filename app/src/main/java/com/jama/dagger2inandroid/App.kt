package com.jama.dagger2inandroid

import android.app.Application
import com.jama.dagger2inandroid.di.component.ApplicationComponent
import com.jama.dagger2inandroid.di.component.DaggerApplicationComponent
import com.jama.dagger2inandroid.di.module.DatabaseModule

class App :Application() {
    companion object{
        lateinit var applicationComponent: ApplicationComponent
    }
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
            .builder()
            .databaseModule(DatabaseModule(applicationContext))
            .build()
    }
}