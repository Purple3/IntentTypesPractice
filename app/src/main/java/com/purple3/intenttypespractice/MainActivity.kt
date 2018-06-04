package com.purple3.intenttypespractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnToNextActivity : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun viewNextActivity(view : View) {
        var nextActivityIntent = Intent(Intent.ACTION_SEND)
        //nextActivityIntent.action = "ACTION_SEND"
        nextActivityIntent.type = "text/plain"
        //if(nextActivityIntent.resolveActivity(packageManager) != null)
            startActivity(Intent.createChooser(nextActivityIntent, "Open Activity.."))
    }

}
