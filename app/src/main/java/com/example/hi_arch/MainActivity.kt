package com.example.hi_arch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hi_arch.scene2.Scene2Activity
import com.example.hi_arch.scene3.Scene3Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goScene1(view: View) {}
    fun goScene2(view: View) {
        startActivity(Intent(this,Scene2Activity::class.java))
    }

    fun goScene3(view: View) {
        startActivity(Intent(this, Scene3Activity::class.java))
    }
}