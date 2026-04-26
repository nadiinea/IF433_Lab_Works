package oop_111152_nadine.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 8.1, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 15, -2.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 12.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, -1.5, "OPEN")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}] : +${it.roe}% ROE (Lev: ${it.leverage}x)" }
}