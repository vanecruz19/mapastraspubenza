package com.example.mapas
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar la primera imagen y título
        imageView1.setImageResource(R.drawable.imagen1)
        textView1.text = "Título 1"

        // Configurar la segunda imagen y título
        imageView2.setImageResource(R.drawable.imagen2)
        textView2.text = "Título 2"

        // Repite para las otras dos imágenes y títulos

        // Configurar la primera imagen y título
        imageView3.setImageResource(R.drawable.imagen3)
        textView3.text = "Título 1"

        // Configurar la segunda imagen y título
        imageView4.setImageResource(R.drawable.imagen4)
        textView4.text = "Título 2"
    }
}

