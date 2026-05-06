package oop_00000105852_RegineGabrielleViola.week11_lab

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Blok hanya dieksekusi jika name tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it")  // 'it' merujuk pada name
        it.length                         // nilai return terakhir
    }
    println("Panjang nama: $length")
}