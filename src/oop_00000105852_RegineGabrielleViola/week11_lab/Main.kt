package oop_00000105852_RegineGabrielleViola.week11_lab

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log Sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")

    println("\n=== TEST WITH ===")
    with(user) {
        println("User Detail -> Nama: $name, Umur: $age")
    }

    println("\n=== TEST APPLY + ALSO ===")
    User("Budi", 20).apply {
        age = 21
    }.also {
        println("User baru berhasil dibuat: $it")
    }
}