package com.example.rockpaperscissors

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val rockButton: Button = findViewById(R.id.rockButton)
        val paperButton: Button = findViewById(R.id.paperButton)
        val scissorsButton: Button = findViewById(R.id.scissorsButton)
        resultTextView = findViewById(R.id.resultTextView)

        rockButton.setOnClickListener { playGame("Камень") }
        paperButton.setOnClickListener { playGame("Бумага") }
        scissorsButton.setOnClickListener { playGame("Ножницы") }
    }

    private fun playGame(playerChoice: String) {
        val choices = listOf("Камень", "Ножницы", "Бумага")
        val computerChoice = choices.random()

        val result = when {
            playerChoice == computerChoice -> "Ничья!"
            playerChoice == "Камень" && computerChoice == "Ножницы" -> "Вы победили!"
            playerChoice == "Ножницы" && computerChoice == "Бумага" -> "Вы победили!"
            playerChoice == "Бумага" && computerChoice == "Камень" -> "Вы победили!"
            else -> "Вы проиграли!"
        }

        resultTextView.text = "Вы выбрали: $playerChoice\nКомпьютер выбрал: $computerChoice\n$result"
    }
}