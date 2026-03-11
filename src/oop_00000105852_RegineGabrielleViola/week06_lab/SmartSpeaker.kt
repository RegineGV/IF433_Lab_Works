package oop_00000105852_RegineGabrielleViola.week06_lab

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker '$name' dinyalakan dan siap menerima instruksi suara.")
    }

    override fun turnOff() {
        println("Speaker '$name' dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}