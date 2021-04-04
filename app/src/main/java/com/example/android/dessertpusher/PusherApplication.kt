package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

// 6-2 : Make an Application class
class PusherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 6-4: Initialize Timber in the application class
        // (Installation of logging trees should be done as early as possible)
        Timber.plant(Timber.DebugTree())

    }
}