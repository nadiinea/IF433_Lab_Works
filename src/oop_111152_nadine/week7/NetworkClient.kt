package oop_111152_nadine.week7

class NetworkClient private constructor(val url: String){
    fun connect(){
        println("Connecting to $url...")
    }
}