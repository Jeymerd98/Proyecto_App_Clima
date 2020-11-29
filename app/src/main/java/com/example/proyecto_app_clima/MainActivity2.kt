package com.example.proyecto_app_clima

import android.app.Activity
import android.content.Intent
import android.inputmethodservice.InputMethodService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.HttpClientStack
import java.net.HttpURLConnection
import java.util.stream.DoubleStream.builder
import java.util.stream.IntStream.builder

class MainActivity2 : AppCompatActivity() {
    var view_Ciudad: TextView = TODO()
    var view_temperatura:TextView = TODO()
    var view_descripcion:TextView = TODO()
    var view_clima:ImageView = TODO()
    var view_buscar: EditText = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        view_Ciudad = findViewById(R.id.Ciudad)
        view_Ciudad.setText("")
        view_temperatura = findViewById(R.id.temperatura)
        view_temperatura.setText("")
        view_descripcion = findViewById(R.id.desc)
        view_descripcion.setText("")
        view_clima = findViewById(R.id.imageView2)
        view_buscar = findViewById(R.id.imageView8)

         fun api_key() {
            HttpURLConnection = HttpURLConnection()
            var request: RequestQueue = Request.build()
                .url("https://api.weatherbit.io/v2.0/current?city=Honduras&key=2d4be65ab733465b8adeb5189a0106f1")
                .get()
                .build()
            var policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)
        }
    }
    fun MainActivity(view: View) {
        val cambio = Intent(this, MainActivity<Any>()::class.java)
        startActivity(cambio)
    }

    fun MainActivity3(view: View) {
        val cambio = Intent(this, MainActivity3()::class.java)
        startActivity(cambio)
    }
}

