package com.example.proyecto_app_clima

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.location.LocationProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Website.URL
import android.telecom.Call
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject
import java.text.AttributedString
import java.net.URL as URL1

class MainActivity<RequestQueue> : AppCompatActivity() {
    private val REQUEST_PERMISSION = 1
    var locationManager : LocationManager = TODO()
    var requestQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        Volley.newRequestQueue(applicationContext)

        locationManager = getSystemService(LOCATION_SERVICE) as LocationManager
        _getLocation
    }
    fun MainActivity2(view: View) {
        val cambio = Intent(this, MainActivity2()::class.java)
        startActivity(cambio)
    }
    val _getLocation : Unit
    @SuppressLint("MissingPermission")
    val location = if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission
            (this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

        ActivityCompat.requestPermissions(this, arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_PERMISSION)
        //ActivityCompat.requestPermissions(this,new String Manifest.permission.ACCESS_FINE_LOCATION,REQUEST_PERMISSION)

        // TODO: Consider calling
        //    ActivityCompat#requestPermissions
        // here to request the missing permissions, and then overriding
        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
        //                                          int[] grantResults)
        // to handle the case where the user grants the permission. See the documentation
        // for ActivityCompat#requestPermissions for more details.

        val location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
        if (location!= null) {
            val latitude = location.latitude
            val longitude  = location.longitude

            Log.d("Main", String.equals(latitude).toString())
            Log.d("Main", String.equals(longitude).toString())
        }
    }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            (REQUEST_PERMISSION) -> {
                _getLocation
            }
        }
    }
    override fun onResume() {
        super.onResume()
        Log.d("Main", "In Resume")
        GetWeather()
    }
    fun GetWeather() {
        val URL = "https://api.weatherbit.io/v2.0/current?city=Honduras&key=2d4be65ab733465b8adeb5189a0106f1"
        //val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, URL, null,  Response.Listener){

        @Suppress("UNREACHABLE_CODE") val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, URL, null, { response ->

            fun onResponse(response:JSONObject){
                var city:JSONObject
                //Log.d("Main", String.equals(response).toString())
                throw Exception()
                try {
                    val response:city
                    JSONObject("city")
                    val name =  city.getString("name")
                    Log.d("Main", name)

                } catch (e:JSONException) {
                    e.printStackTrace()
                }
            }
        },
                { error ->

                }
        ) }

    class city {

    }

}

