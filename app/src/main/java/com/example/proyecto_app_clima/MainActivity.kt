package com.example.proyecto_app_clima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun MainActivity2(view: View) {
        val cambio = Intent(this, MainActivity2()::class.java)
        startActivity(cambio)
    }
}