package com.example.tictactoe

object CheckWin {

    fun win(list: ArrayList<String>): Boolean {

        //Check first player win
        if (list[0] == "X" && list[1] == "X" && list[2] == "X") {
            return true
        }

        if (list[3] == "X" && list[4] == "X" && list[5] == "X") {
            return true
        }

        if (list[6] == "X" && list[7] == "X" && list[8] == "X") {
            return true
        }

        if (list[0] == "X" && list[3] == "X" && list[6] == "X") {
            return true
        }

        if (list[1] == "X" && list[4] == "X" && list[7] == "X") {
            return true
        }

        if (list[2] == "X" && list[5] == "X" && list[8] == "X") {
            return true
        }

        if (list[0] == "X" && list[4] == "X" && list[8] == "X") {
            return true
        }

        if (list[2] == "X" && list[4] == "X" && list[6] == "X") {
            return true
        }


        //Check for second player win
        if (list[0] == "O" && list[1] == "0" && list[2] == "O") {
            return true
        }

        if (list[3] == "O" && list[4] == "O" && list[5] == "O") {
            return true
        }

        if (list[6] == "O" && list[7] == "O" && list[8] == "O") {
            return true
        }

        if (list[0] == "O" && list[3] == "X" && list[6] == "X") {
            return true
        }

        if (list[1] == "O" && list[4] == "O" && list[7] == "O") {
            return true
        }

        if (list[2] == "O" && list[5] == "O" && list[8] == "O") {
            return true
        }

        if (list[0] == "O" && list[4] == "O" && list[8] == "O") {
            return true
        }

        if (list[2] == "O" && list[4] == "O" && list[6] == "O") {
            return true
        }

        return false

    }

}