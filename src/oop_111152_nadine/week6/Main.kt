package oop_111152_nadine.week6

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout..")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2() = CreditCard()

    println("\n--- TETING CHECKOUT ---")
    processCheckout(pay1, 50000)
    processCheckout(pay2, 150000)
}