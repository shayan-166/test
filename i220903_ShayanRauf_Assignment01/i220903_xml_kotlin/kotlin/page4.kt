package com.fast.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val myButton: Button = findViewById(R.id.login)
        val img: ImageView = findViewById(R.id.button4)

        img.setOnClickListener{

            //  Toast.makeText(applicationContext, "fludog", Toast.LENGTH_SHORT).show()
            //   layout.setBackgroundResource(R.color.yellow)
            intent=Intent(applicationContext, MainActivity3::class.java )
            startActivity(intent)
        }

        myButton.setOnClickListener{

            //  Toast.makeText(applicationContext, "fludog", Toast.LENGTH_SHORT).show()
            //   layout.setBackgroundResource(R.color.yellow)
            intent=Intent(applicationContext, page5::class.java )
            startActivity(intent)
        }

    }
}