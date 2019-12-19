package com.dam2.android_tutoriales_basicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tutorial1.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener {
        val intent = Intent(this, Tutorial1::class.java)


        startActivity(intent)

        }

        button2.setOnClickListener {
            val intent = Intent(this, Tutorial2::class.java)


            startActivity(intent)

        }

        button3.setOnClickListener {
            val intent = Intent(this, Tutorial3::class.java)


            startActivity(intent)

        }








        // esto se ejecuta cuando se crea la actividad
    Log.e("primerTest","Pasa Por OnCreate")

    }

    override fun onStart() {
        super.onStart()
        // Esto se ejecuta justo de despues de onCreate() o un  onRestart()
        Log.e("primerTest","Pasa Por OnStart")
    }

    override fun onResume() {

        super.onResume()
        // esto se ejecuta cuanto el usuario reanuda la actividad
        Log.e("primerTest","Pasa Por OnResume")

    }

    override fun onPause() {
        super.onPause()
        // esto se ejecuta cuando cambias la actividad a segundo plano y pausa la actual si el proceso de la aplicacion es matado tiene que pasar por el onCreate()

        Log.e("primerTest","Pasa Por OnPause")
    }

    override fun onStop() {
        super.onStop()
        // esto se ejecuta cuando la actividad ya no es visible
        Log.e("primerTest","Pasa Por OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        // esto se ejecuta cuando la actividad se cierra totalmente
        Log.e("primerTest","Pasa Por OnDestroy")

    }

}
