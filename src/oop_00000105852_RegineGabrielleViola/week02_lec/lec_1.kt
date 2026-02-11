package oop_00000105852_RegineGabrielleViola.week02_lec

class Jagoan{
    var nama: String = "gatau"
    var hp: Int = 100

    init {
        println("Halo saya constructor")
        nama = "Udin"
        hp = 120
    }

    constructor(darahhero:Int = 200) {
        println("ini constructor kedua!")
        this.hp = darahhero
    }

    fun jalan() {
        println("Hero $nama jalan kaki ke pasar")
    }

    fun serang() {
        println("Hero serang dengan life: $hp")
    }
}

fun main() {
    val hero = Jagoan( 250)
    println("Darah hero: ${hero.hp}")
    hero.jalan()
    hero.serang()
    println("Namaa si hero: ${hero.nama}")
}