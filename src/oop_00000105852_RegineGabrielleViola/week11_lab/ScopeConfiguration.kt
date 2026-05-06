package oop_00000105852_RegineGabrielleViola.week11_lab

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)  // User(name=Alex, age=25)
}