package com.example.appbeer

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBeer : Button = findViewById(R.id.btnBeer)
        val tvBeer : TextView = findViewById(R.id.tvBeer)
        val spinnerBeer : Spinner = findViewById(R.id.spinBeer)
        val imageBeer : ImageView = findViewById(R.id.imBeer)

        btnBeer.setOnClickListener {
            val type = spinnerBeer.selectedItem
            tvBeer.text = "Ваш тип пива $type"
            when (spinnerBeer.selectedItem) {
                "Тёмное" -> imageBeer.setImageResource(R.drawable.temnoe)
                "Светлое" -> imageBeer.setImageResource(R.drawable.svetloe)
                "Ржаное" -> imageBeer.setImageResource(R.drawable.rhanoe)
                "Сладкое" ->imageBeer.setImageResource(R.drawable.sladkoe)
                "Горькое" ->imageBeer.setImageResource(R.drawable.gorkoe)
            }
        }
    }
}