package oop_00000105852_RegineGabrielleViola.week08_lab

sealed class Product
data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()
data class Clothing(val id: String, val name: String, val size: String) : Product()