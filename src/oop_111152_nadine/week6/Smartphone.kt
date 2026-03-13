package oop_111152_nadine.week6

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smarthpone berhasil booting.")
    }
}