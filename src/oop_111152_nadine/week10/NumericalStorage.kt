package oop_111152_nadine.week10

class MathBox<T : Number>(
    val value1: T,
    val value2: T
) {

    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}