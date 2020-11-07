package com.praktek1android

import android.content.intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDeLayed({
            val i = Intent(packageContext: this, MainActivity::class.java)
            startActivity(i)
        }, delayMillis: 2000)
    }
}