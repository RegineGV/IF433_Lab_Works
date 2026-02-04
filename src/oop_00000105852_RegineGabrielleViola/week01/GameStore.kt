package oop_00000105852_RegineGabrielleViola.week01

fun main() {
    val title = "ENCHANTED Ring"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = title, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN ===")
    println("Game: $title")
    println("Bayar: Rp $finalPrice")
}