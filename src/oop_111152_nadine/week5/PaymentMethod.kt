package oop_111152_nadine.week5

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}