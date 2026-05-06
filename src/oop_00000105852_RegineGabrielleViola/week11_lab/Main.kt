package oop_00000105852_RegineGabrielleViola.week11_lab

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())           // Hello, Alex
    println("Hi".repeatTimes(3))            // HiHiHi

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")  // true

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
    val newUser = User("Budi", 20).apply {
        age = 21  // ubah umur
    }.also {
        println("User baru berhasil dibuat: $it")
    }

    // === Pencahayaan ===
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline  = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}