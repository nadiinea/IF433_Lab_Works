package oop_111152_nadine.week7

fun main() {
    println("--- TEST SINGLETON ---")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n--- TEST COMPANION OBJECT ---")
    val client = NetworkClient.createClient()
    client.connect()

    println("\--- TEST REGULAR CLASS ---")
    val reg1 = User("Nadine", 19)
    val reg2 = User("Nadine", 19)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}