package oop_111152_nadine.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(source = System.`in`)

    println("--- APLIKASI PMB UNN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}