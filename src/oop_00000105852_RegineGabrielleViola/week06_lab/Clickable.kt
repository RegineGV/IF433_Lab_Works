package oop_00000105852_RegineGabrielleViola.week06_lab

interface Clickable {
    val name: String // Abstract property, tidak ada nilai default
    fun click()
}

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}