package oop_00000105852_RegineGabrielleViola.week06_lab

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu '$name' dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu '$name' dimatikan.")
    }
}