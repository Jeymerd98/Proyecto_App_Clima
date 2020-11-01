package com.example.proyecto_app_clima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

<<<<<<< HEAD
class MainActivity2 : AppCompatActivity(){
=======
class MainActivity2 : AppCompatActivity() {
>>>>>>> origin/master
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
<<<<<<< HEAD
    fun MainActivity(view: View) {
        val cambio = Intent(this, MainActivity()::class.java)
        startActivity(cambio)
    }
=======
>>>>>>> origin/master
    fun MainActivity3(view: View) {
        val cambio = Intent(this, MainActivity3()::class.java)
        startActivity(cambio)
    }
<<<<<<< HEAD
}
=======
    fun MainActivity(view: View) {
        val cambio = Intent(this, MainActivity()::class.java)
        startActivity(cambio)
    }
}
>>>>>>> origin/master
