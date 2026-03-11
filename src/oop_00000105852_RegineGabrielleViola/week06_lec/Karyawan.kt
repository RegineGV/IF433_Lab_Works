package oop_00000105852_RegineGabrielleViola.week06_lec

class Karyawan(
    override val namaKerjaan: String,
    override val gaji: Int,
    override val jmlHari: Int
) : Bekerja {

    override fun ngoding() {
        println("kerjaan kamu $namaKerjaan")
        println("Gaji kamu ${super.GajiDidapat}")
    }
}