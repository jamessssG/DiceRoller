package com.example.diceroller  // <- make sure this matches your actual package

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private lateinit var rollButton: Button

    private val diceFaces = listOf(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.diceImage)
        rollButton = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val faceIndex = Random.nextInt(diceFaces.size)
        diceImage.setImageResource(diceFaces[faceIndex])
    }
}