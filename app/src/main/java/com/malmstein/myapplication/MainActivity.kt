package com.malmstein.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.appevents.AppEventsLogger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logger = AppEventsLogger.newLogger(this)
        logger.logEvent("PIXEL TEST START")
    }
}
