package oop_111152_nadine.week7

fun main() {
    println("--- TEST SINGLETON ---")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n--- TEST COMPANION OBJECT ---")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n--- TEST REGULAR CLASS ---")
    val reg1 = RegularUser("Nadine", 19)
    val reg2 = RegularUser("Nadine", 19)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n--- TEST DATA CLASS ---")

    val data1 = DataUser("Nadine", 19)
    val data2 = DataUser("Nadine", 19)

    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n--- TEST SEALED CLASS ---")

    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    println("\n--- TEST GAME MANAGER ---")
    GameManager.startGame()
    GameManager.startGame()

    println("\n--- TEST RARITY & FACTORY ---")
    println(ItemRarity.LEGENDARY.dropChance)
    val weapon = Weapon.forgeStarterSword()
    println("${weapon.item.name} ${weapon.item.damage} ${weapon.item.rarity} ${weapon.durability}")
}