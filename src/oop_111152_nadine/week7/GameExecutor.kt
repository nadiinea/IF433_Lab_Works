package oop_111152_nadine.week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Bertemu monster: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Mendapat loot: ${event.item.name} (${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Berada di zona aman")
        }
    }
}