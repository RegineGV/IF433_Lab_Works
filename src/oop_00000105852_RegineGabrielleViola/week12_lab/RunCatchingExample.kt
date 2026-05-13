package oop_00000105852_RegineGabrielleViola.week12_lab

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}