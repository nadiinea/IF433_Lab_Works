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
}