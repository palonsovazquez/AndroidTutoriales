package com.dam2.android_tutoriales_basicos

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tutorial1.*


class Tutorial1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial1)


        botonT1.setOnClickListener {
            textoBoton.setText("Boton superior pulado")
            Log.e("Tut1","botonPulsado")
             //longToast("sdjfkhasdkfhaslkj")

            it.setBackgroundColor(Color.YELLOW)
            //startActivity(intentFor<SomeOtherActivity>(browse("http://www.google.es")))
            // anko
            // startActivity<activity2test>("color" to "rojos los rojos")

            val intent = Intent(this, Tuto1_actividad2::class.java)
            intent.putExtra("color", "rojo kotlin")
            //intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

    }
}
