package oop_00000105852_RegineGabrielleViola.week12_lab

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // Pattern: getOrElse
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")
}