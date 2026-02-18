package oop_00000105852_RegineGabrielleViola.week03_lab

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}