package oop_00000105852_RegineGabrielleViola.week08_lab

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls: Berhenti dan return null jika ada yang null di tengah
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    // .let memastikan blok hanya jalan jika tidak null
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf("Smartphone", 1500000, UserProfile("Andi", null), "Laptop", 4500000.0)

    for (item in mixedData) {
        val text = item as? String // Jika gagal cast, return null
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast fallback: $safeString")

    //coba main.kt
}