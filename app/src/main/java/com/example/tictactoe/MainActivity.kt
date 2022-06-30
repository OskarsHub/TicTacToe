package com.example.tictactoe

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.WinnerText
import com.example.tictactoe.CheckWin.win

class MainActivity : AppCompatActivity(), View.OnClickListener {


    // If player1 == true, it's player1 turn and if false then player2 turn
    private var player1 = true
    private var turn = 0

   // If gameMod == ture, then game is on normalMode and if false then game is on infiniteMode
    private var gameMode = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PlayerOne.text = "Player 1 = X"
        PlayerTwo.text = "Player 2 = O"

        Button11.setOnClickListener(this)
        Button12.setOnClickListener(this)
        Button13.setOnClickListener(this)
        Button21.setOnClickListener(this)
        Button22.setOnClickListener(this)
        Button23.setOnClickListener(this)
        Button31.setOnClickListener(this)
        Button32.setOnClickListener(this)
        Button33.setOnClickListener(this)
        resetButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        //Set click listeners for every button

        when (view!!.id) {

            R.id.Button11 -> {
                checkPlayer(Button11)
                turn++
            }

            R.id.Button12 -> {
                checkPlayer(Button12)
                turn++
            }

            R.id.Button13 -> {
                checkPlayer(Button13)
                turn++
            }

            R.id.Button21 -> {
                checkPlayer(Button21)
                turn++
            }

            R.id.Button22 -> {
                checkPlayer(Button22)
                turn++
            }

            R.id.Button23 -> {
                checkPlayer(Button23)
                turn++
            }

            R.id.Button31 -> {
                checkPlayer(Button31)
                turn++
            }

            R.id.Button32 -> {
                checkPlayer(Button32)
                turn++
            }

            R.id.Button33 -> {
                checkPlayer(Button33)
                turn++
            }

            R.id.resetButton -> {
                restartGame()
            }

        }


        val list = arrayListOf<String>(Button11.text as String, Button12.text as String,
                            Button13.text as String, Button21.text as String,
                            Button22.text as String, Button23.text as String,
                            Button31.text as String, Button32.text as String,
                            Button33.text as String)

        val winner = win(list)        // Checks if player has three on row and if so, then return true

        val winnerText: TextView = findViewById(R.id.WinnerText)

        if (turn > 0){
            // When first turn is passed, then erases winnerText
            winnerText.text = ""
        }
        
        if (winner){
            //If player has three in row then print who won and disables every button

            if(!player1) {
                winnerText.text = "Player 1 won"
            }

            if(player1) {
                winnerText.text = "Player 2 won"
            }

            Button11.isClickable = false
            Button12.isClickable = false
            Button13.isClickable = false

            Button21.isClickable = false
            Button22.isClickable = false
            Button23.isClickable = false

            Button31.isClickable = false
            Button32.isClickable = false
            Button33.isClickable = false

        }

    }


    private fun checkPlayer(Button: Button){
        //Check who's turn and change button text according that

        var colorRed  = Color.RED
        var colorBlue = Color.BLUE

        if (player1) {
            Button.text = "X"
            Button.setTextColor(colorRed)
            Button.isClickable = false

            player1 = false

            return
        }

        if (!player1) {
            Button.text = "O"
            Button.setTextColor(colorBlue)
            Button.isClickable = false

            player1 = true

            return
        }

        return
    }

    private fun restartGame() {
        //Erases every button text, makes them clickable and prints who starts

        val winnerText: TextView = findViewById(R.id.WinnerText)

        //Reset every buttons text
        Button11.text = ""
        Button12.text = ""
        Button13.text = ""

        Button21.text = ""
        Button22.text = ""
        Button23.text = ""

        Button31.text = ""
        Button32.text = ""
        Button33.text = ""

        //Set every button to be clickable
        Button11.isClickable = true
        Button12.isClickable = true
        Button13.isClickable = true

        Button21.isClickable = true
        Button22.isClickable = true
        Button23.isClickable = true

        Button31.isClickable = true
        Button32.isClickable = true
        Button33.isClickable = true

        if (player1) {
            winnerText.text = "Player 1 start"
        }

        if (!player1) {
            winnerText.text = "Player 2 start"
        }

        turn = 0

    }

}












