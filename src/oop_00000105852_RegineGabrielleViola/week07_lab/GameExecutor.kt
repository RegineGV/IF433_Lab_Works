package oop_00000105852_RegineGabrielleViola.week07_lab

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Kamu diserang oleh ${event.monsterName}!")
        is BattleState.LootDropped -> println("Hooray! Kamu mendapatkan loot: ${event.item.name} (Rarity: ${event.item.rarity})")
        is BattleState.GameOver -> println("GAME OVER. Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Kamu memasuki Safe Zone. Silakan beristirahat.")
    }
}