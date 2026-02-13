package oop_111152_nadine.week02

import oop_111152_nadine.week2.Loan
import oop_111152_nadine.week2.Student
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== LIBRARY FINE SYSTEM ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        println("Durasi tidak boleh minus! Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n=== Detail Peminjaman ===")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}