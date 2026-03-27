package oop_111152_nadine.week7

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan!")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}