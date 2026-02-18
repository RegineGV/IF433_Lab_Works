package oop_00000105852_RegineGabrielleViola.week03_lab

fun main() {
    val e = Employee("Budi")
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")
}