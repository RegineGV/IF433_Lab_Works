package oop_00000105852_RegineGabrielleViola.week07_lab

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}