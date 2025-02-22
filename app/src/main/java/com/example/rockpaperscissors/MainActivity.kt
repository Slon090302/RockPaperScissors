package com.example.rockpaperscissors

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val playButton: Button = findViewById(R.id.playButton)
        val rulesButton: Button = findViewById(R.id.rulesButton)

        playButton.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }

        rulesButton.setOnClickListener {
            startActivity(Intent(this, RulesActivity::class.java))
        }


    }
}