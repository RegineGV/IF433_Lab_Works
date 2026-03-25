package oop_00000105852_RegineGabrielleViola.week07_lab

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String): BattleState()
    data class LootDropped(val item: GameItem): BattleState()
    data class GameOver(val reason: String): BattleState()
    object SafeZone: BattleState()
}