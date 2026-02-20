package oop_111152_nadine.week3

fun main() {
    val e = Employee( "Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yg harus dibayar: ${e.tax}")

    println("\n-- TEST WEAPON --")

    val w = Weapon("Excalibur")

    w.damage = -50
    w.damage = 9999

    println("Weapon: ${w.name}")
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")
}