package com.palash.networkconnection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.palash.networkconnection.utils.NetworkUtils

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("MyTag", "${NetworkUtils.isInternetAvailable(this)}")
    }
}