package com.example.detection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {


        val i = Intent(applicationContext,MainActivity::class.java)
        val myi = Intent(applicationContext,diease_predication::class.java)
        when(keyCode)
        {
            KeyEvent.KEYCODE_VOLUME_UP ->  startActivity(myi)
            KeyEvent.KEYCODE_VOLUME_DOWN -> startActivity(i)

        }
        return true
    }
}