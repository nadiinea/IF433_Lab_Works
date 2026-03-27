package oop_111152_nadine.week7

fun main() {
    println("--- TEST SINGLETON ---")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n--- TEST COMPANION OBJECT ---")
    val client = NetworkClient.createClient()
    client.connect()
}