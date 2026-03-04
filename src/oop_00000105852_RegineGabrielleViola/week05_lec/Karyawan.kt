package oop_00000105852_RegineGabrielleViola.week05_lec

abstract class Karyawan {
    val nama:String = "Budi";
    abstract fun bekerja(kecepatan:Int = 3):String;
    fun terima_gaji() {
        println("hero gajian!!!");
    }
}

class Staff:Karyawan() {
    override fun bekerja(kecepatan: Int): String {
        return "Staff sedang ngetik, kecepatan: $kecepatan";
    }

}

class Manager:Karyawan() {
    override fun bekerja(kecepatan:Int): String {
        return "Manager mengawasi $kecepatan km/jam";
    }
}
fun main() {
    val staff = Staff();
    staff.bekerja(kecepatan = 7);

    println("staff.bekerja: ${staff.bekerja(kecepatan = 7)}");

    val mgr = Manager();
    mgr.bekerja(kecepatan = 12);

    println("Manager kerja: ${mgr.bekerja(kecepatan = 12)}");
}