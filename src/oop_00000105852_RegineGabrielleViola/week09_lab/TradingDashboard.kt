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
}