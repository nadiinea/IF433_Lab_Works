package oop_111152_nadine.week6

fun main()
    val lamp = SmartLamp("L1", "Ruang Tamu")
    val speaker = SmartSpeaker("S1", "Google Nest Dapur")
    val cctv = SmartCCTV("C1", "Ezviz Garasi")
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}