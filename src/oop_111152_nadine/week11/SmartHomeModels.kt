package oop_111152_nadine.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String {
    return if (isOnline) {
        "$name dalam kondisi ONLINE dengan daya ${powerLoad}W"
    } else {
        "$name sedang OFFLINE"
    }
}