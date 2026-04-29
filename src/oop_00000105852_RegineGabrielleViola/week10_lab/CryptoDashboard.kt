package oop_00000105852_RegineGabrielleViola.week10_lab

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 3.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    println("=== DAFTAR KOIN ===")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Balance: ${coin.balance}")
    }
}