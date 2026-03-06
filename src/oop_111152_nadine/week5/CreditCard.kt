package oop_111152_nadine.week5

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil bayar Rp$amount menggunakan Credit Card.")
            println("Total terpakai: Rp$usedAmount dari limit Rp$limit")
        } else {
            println("$accountName: Transaksi ditolak (melebihi limit)")
        }

    }
}