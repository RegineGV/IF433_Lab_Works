package oop_00000105852_RegineGabrielleViola.week05_lab

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}