package oop_00000105852_RegineGabrielleViola.week07_lab

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(50),
    RARE(20),
    EPIC(5),
    LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)