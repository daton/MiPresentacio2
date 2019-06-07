package org.unitec.mipresentacio2

import android.content.res.Resources
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_catalogo.*

class CatalogoActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_inicio -> {
                textMessage.setText("Diseñador Juan Carlos")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_diseno -> {
                textMessage.setText("Mis Diseños")

                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_animacion -> {
                textMessage.setText("Mis animaciones")

                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_contacto -> {
                textMessage.setText("Escribenos!!")

                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
