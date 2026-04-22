package oop_00000105852_RegineGabrielleViola.week09_lab

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)