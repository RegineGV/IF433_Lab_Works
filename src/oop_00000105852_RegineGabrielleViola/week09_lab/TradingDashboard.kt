package oop_00000105852_RegineGabrielleViola.week09_lab

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, 22.7, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 20, 3.1, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 10, -1.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 25, 18.0, "CLOSED")
    )

    // Pipeline 1: Hanya transaksi CLOSED
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    // Pipeline 2: Winning trades (roe > 0)
    val winningTrades = closedTrades.filter { it.roe > 0 }

    // Pipeline 3: Losing trades (roe <= 0)
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // Pipeline 4: Urutkan profit tertinggi lalu format ke String
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline 5: Urutkan loss terbesar (paling minus) lalu format ke String
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline Tambahan: Semua koin unik yang pernah ditradingkan
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("\n--- TOP PERFORMERS (WIN) ---")
    topPerformersString.forEach { println(it) }
}