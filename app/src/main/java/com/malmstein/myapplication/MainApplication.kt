package com.malmstein.myapplication

import android.app.Application
import com.facebook.FacebookSdk
import com.facebook.LoggingBehavior
import com.facebook.appevents.AppEventsLogger

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        FacebookSdk.sdkInitialize(this)
        FacebookSdk.setIsDebugEnabled(true)
        FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS)
    }
}