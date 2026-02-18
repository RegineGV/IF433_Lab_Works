package oop_00000105852_RegineGabrielleViola.week03_lab

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif!")
            } else if (value > 1000) {
                field = 1000 // Paksa nilai ke 1000 [cite: 103]
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
            else -> "Common"
        }
}