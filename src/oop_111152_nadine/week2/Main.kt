package oop_111152_nadine.week02

import oop_111152_nadine.week2.Hero
import oop_111152_nadine.week2.Loan
import oop_111152_nadine.week2.Student
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== APLIKASI PMB UMN ===")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

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

    println("\n=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val heroDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, heroDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("Kamu kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.hp > 0 && enemyHp == 0) {
        println("Hero menang!")
    } else if (hero.hp == 0) {
        println("Musuh menang!")
    } else {
        println("Pertarungan dihentikan.")
    }
}