package oop_111152_nadine.week5

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    print("--- AKTIVITAS PEGAWAI ---")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sbagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    println("\n--- TEST MATH HELPER ---")

    val math = MathHelper()

    println("Luas Persegi (sisi 4): ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang (5 x 3): ${math.hitungLuas(5,3)}")
    println("Luas Lingkaran (r = 7): ${math.hitungLuas(7.0)}")

    println("\n--- TEST PAYMENT SYSTEM ---")

    val ewallet = EWallet("Nadine", 50000.0)
    val creditCard = CreditCard("Nadine", 100000.0)

    val payments: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (payment in payments) {
        payment.processPayment(75000.0)

        if (payment is EWallet) {
            println("Saldo kurang, melakukan top up...")
            payment.topUp(50000.0)
            println("Mencoba transaksi lagi...")
            payment.processPayment(75000.0)
        }
    }
}