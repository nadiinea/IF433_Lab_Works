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

// ===== IMPLEMENTASI: EmailNotifier =====
class EmailNotifier : NotificationService {
    override fun sendNotification(order: Order) {
        println("Email terkirim: Pesanan ${order.itemName} Anda telah dikonfirmasi!")
    }
}

// ===== SAFE ORDER PROCESSOR (inject lewat constructor) =====
class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
)