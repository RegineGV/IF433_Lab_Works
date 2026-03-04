package oop_00000105852_RegineGabrielleViola.week05_lab

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar $amount Berhasil. Sisa Saldo: $balance")
        } else {
            println("[$accountName] Transaksi Gagal: Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up Berhasil. Saldo sekarang: $balance")
    }
}