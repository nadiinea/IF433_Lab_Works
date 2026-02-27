package oop_111152_nadine.week4

open class Employee(
    val name: String,
    val baseSalary: Int
) {
    open fun work() {
        println("$name sedang bekerja.")
    }
    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
}