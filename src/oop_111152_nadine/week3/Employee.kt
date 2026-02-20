package oop_111152_nadine.week3

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji gaboleh negatif! Diset ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}