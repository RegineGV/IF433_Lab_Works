package oop_00000105852_RegineGabrielleViola.week06_lec

interface Bekerja {
    val namaKerjaan: String
    val gaji: Int
    val jmlHari: Int

    val GajiDidapat: Int
        get() = gaji * jmlHari

    public fun ngoding(){
    }
}