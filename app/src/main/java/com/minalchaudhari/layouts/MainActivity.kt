package com.minalchaudhari.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1 :FloatingActionButton=findViewById(R.id.play)
        var b2 :FloatingActionButton=findViewById(R.id.pause)
        b1.setOnClickListener{
            playpause()
        }
        b2.setOnClickListener {
            stop()
        }
    }
    fun playpause()
    {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERKEY).apply{
            startService(this)
        }
    }
    fun stop()
    {
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERKEY).apply {
            stopService(this)
        }
    }
}