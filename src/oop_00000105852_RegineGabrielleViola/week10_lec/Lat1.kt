package oop_00000105852_RegineGabrielleViola.week10_lec

class meja(val hasil:Any)

class kursi<T>(val hasil:T)

fun main() {
    val mj = meja( 100)
    val hargaMeja = mj.hasil as Int
    println(hargaMeja + 50)

    val chair = kursi(300);
    println(chair.hasil + 50);
}