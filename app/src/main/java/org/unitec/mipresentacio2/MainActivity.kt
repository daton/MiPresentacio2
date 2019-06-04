package org.unitec.mipresentacio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //b) manejamos el evento de boton usando el id que le asignamos
        navegar.setOnClickListener {

            var algo= Intent(this, CatalogoActivity::class.java)
            startActivity(algo)

            Toast.makeText(this, "Bienvenido al catálogo", Toast.LENGTH_LONG).show()


        }

    }
}
