package oop_00000105852_RegineGabrielleViola.week05_lab

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar $amount Berhasil.")
        } else {
            println("[$accountName] Transaksi Ditolak: Melebihi limit.")
        }
    }
}