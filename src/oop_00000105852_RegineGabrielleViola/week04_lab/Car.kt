package oop_00000105852_RegineGabrielleViola.week04_lab

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logika asli dari Parent
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}