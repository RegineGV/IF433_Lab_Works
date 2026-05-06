package oop_00000105852_RegineGabrielleViola.week11_lab

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())           // Hello, Alex
    println("Hi".repeatTimes(3))            // HiHiHi

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")  // true
}