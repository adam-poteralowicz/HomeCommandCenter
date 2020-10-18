package com.apap.hcc

import android.os.Bundle
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import androidx.appcompat.app.AppCompatActivity

open class FullscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        window?.addFlags(FLAG_FULLSCREEN)
    }

    override fun onDestroy() {
        window?.clearFlags(FLAG_FULLSCREEN)
        super.onDestroy()
    }
}