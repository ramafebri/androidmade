package com.example.gamecatalogue

import android.app.Application
import com.example.gamecatalogue.core.di.databaseModule
import com.example.gamecatalogue.core.di.networkModule
import com.example.gamecatalogue.core.di.repositoryModule
import com.example.gamecatalogue.di.useCaseModule
import com.example.gamecatalogue.di.viewModelModule

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

open class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}