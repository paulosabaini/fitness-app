package com.example.fitnessapp

import android.app.Application
import com.example.fitnessapp.core.network.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module
import timber.log.Timber
import timber.log.Timber.Forest.plant

class FitnessApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@FitnessApp)

            if (BuildConfig.DEBUG) {
                plant(Timber.DebugTree())
            }

            modules(NetworkModule().module)
        }
    }
}