package oop_111152_nadine.week5

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil bayar Rp$amount. Sisa saldo: Rp$balance")
        } else {
            println("$accountName: Saldo ga cukup")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("$accountName top up Rp$amount. Saldo sekarang: Rp$balance")
    }
}