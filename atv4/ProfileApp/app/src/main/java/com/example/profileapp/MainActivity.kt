package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val profileImage = findViewById<ImageView>(R.id.imageView)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)
        nameText.text = "Thamires Taboza"
        descriptionText.text = "Desenvolvedora de software com 3 anos de experiência."
        currentJobText.text = "Emprego Atual: Engenheira de Software na Santander"

        // Lista de experiências
        val experiencias = listOf(
            "Analista de Sistemas - Empresa A",
            "Desenvolvedora Júnior - Empresa B",
            "Estagiária - Empresa C"
        )

        // Adicionando experiências dinamicamente
        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }
        profileImage.setOnClickListener {
            Toast.makeText(this, "Foto de perfil de Thamires Taboza", Toast.LENGTH_SHORT).show()
        }


    }
}