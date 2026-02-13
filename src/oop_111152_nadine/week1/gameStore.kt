package oop_111152_nadine.week1

fun main() {
    val gameTitle = "Cyber Adventure 2077"
    val price = 650_000
    val finalPrice = calculateDiscount(price)

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote ?: "Tidak ada catatan"
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500_000) (price * 80) / 100 else (price * 90) / 100

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : $note")
}
