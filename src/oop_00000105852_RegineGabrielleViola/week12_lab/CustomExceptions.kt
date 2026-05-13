package oop_00000105852_RegineGabrielleViola.week12_lab

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")