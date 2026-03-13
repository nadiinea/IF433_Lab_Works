package oop_111152_nadine.week6

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu $name dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}