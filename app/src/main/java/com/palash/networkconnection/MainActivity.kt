package com.palash.networkconnection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.palash.networkconnection.utils.NetworkUtils

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button!!.setOnClickListener {
            Toast.makeText(this, "Internet Available ${NetworkUtils.isInternetAvailable(this)}", Toast.LENGTH_SHORT).show()
            Log.d("MyTag", "${NetworkUtils.isInternetAvailable(this)}")
        }
    }
}