package com.example.proyecto_app_clima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun MainActivity(view: View) {
        val cambio = Intent(this, MainActivity()::class.java)
        startActivity(cambio)
    }
    fun MainActivity3(view: View) {
        val cambio = Intent(this, MainActivity3()::class.java)
        startActivity(cambio)
    }
}