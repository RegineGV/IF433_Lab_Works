package oop_00000105852_RegineGabrielleViola.week07_lab

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Excalibur Palsu", 150, ItemRarity.EPIC)
            return Weapon(item, 200)
        }
    }

    override fun toString(): String {
        return "${item.name} (DMG: ${item.damage}, Rarity: ${item.rarity}, Durability: $durability)"
    }
}