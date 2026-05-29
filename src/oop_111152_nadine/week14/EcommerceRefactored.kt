package oop_111152_nadine.week14
import java.io.File

data class Order(val itemName: String, val finalPrice: Double, val customerType: String)

interface OrderRepository {
    fun saveOrder(order: Order)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(order: Order) {
        File("orders.csv").bufferedWriter().use { writer ->
            writer.appendLine("${order.itemName},${order.finalPrice},${order.customerType}")
        }
    }
}

interface NotificationService {
    fun sendNotification(order: Order)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(order: Order) {
        println("Email terkirim: Pesanan ${order.itemName} Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
)

// ===== INTERFACE: PricingStrategy =====
interface PricingStrategy {
    fun calculate(price: Double): Double
}

// ===== IMPLEMENTASI =====
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90 // Diskon 10%
}

fun SafeOrderProcessor.processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
    val finalPrice = pricing.calculate(basePrice)
    println("Memproses pesanan $itemName seharga $finalPrice")

    val order = Order(itemName, finalPrice, pricing::class.simpleName ?: "Unknown")
    repo.saveOrder(order)
    notifier.sendNotification(order)
}