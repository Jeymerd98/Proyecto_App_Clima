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
import android.telecom.Call
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.app.ActivityCompat
import org.json.JSONObject
import java.text.AttributedString

class MainActivity : AppCompatActivity() {
    private val REQUEST_PERMISSION = 1
    var locationManager : LocationManager = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
    }
}
