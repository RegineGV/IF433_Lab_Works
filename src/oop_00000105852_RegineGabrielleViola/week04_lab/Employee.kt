package oop_00000105852_RegineGabrielleViola.week04_lab

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (0.1 * baseSalary).toInt() // Bonus 10%
    }
}