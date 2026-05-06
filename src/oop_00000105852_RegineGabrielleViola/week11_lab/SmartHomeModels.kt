package oop_00000105852_RegineGabrielleViola.week11_lab

data class SmartDevice(
    var name      : String,
    var category  : String,
    var isOnline  : Boolean = false,
    var powerLoad : Int     = 0
)