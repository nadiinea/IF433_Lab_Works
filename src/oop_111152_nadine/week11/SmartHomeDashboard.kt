package oop_111152_nadine.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    homeDevices.add(
        SmartDevice(
            name = "Philips WiZ Living Room",
            category = "Lighting",
            isOnline = true,
            powerLoad = 12
        ).apply {
            println("Setup perangkat: $name")
        }
    )

    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also {
            println("(LOG) Kamera terhubung")
        }
        .let {
            homeDevices.add(it)
        }

    println("\n=== DEVICE STATUS ===")
    homeDevices.forEach {
        with(it) {
            println(
                "Perangkat: $name | " +
                        "Kategori: $category | " +
                        "Online: $isOnline | " +
                        "Daya: ${powerLoad}W"
            )
        }
    }

    val activeDevices = homeDevices.filter {
        it.isOnline
    }

    println("\n=== ACTIVE DEVICES ===")
    activeDevices.forEach {
        println("${it.name} aktif")
    }

    val totalPower = homeDevices.sumOf {
        it.powerLoad
    }
}

