package oop_00000105852_RegineGabrielleViola.week01

fun main() {
    // Checkpoint 7: Val & String Templates
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    // Checkpoint 8: Panggil fungsi expression body
    println(checkSize(area))
}

// Checkpoint 8: Expression Body Function (mengembalikan String)
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"