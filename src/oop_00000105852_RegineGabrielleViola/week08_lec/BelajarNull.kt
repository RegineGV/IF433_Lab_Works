package oop_00000105852_RegineGabrielleViola.week08_lec

class set_krs(val nim: String, val tahun: Int?) {
    fun pilih_matkul(kodeMatkul: String?) {
        println("matkul dipilih $kodeMatkul");
    }
}

fun main() {
    var nama:String? = "osvaldo";
    nama = null;
    println("hai $nama");

    val setKRS = set_krs(nim = "123", tahun = null)
    println("si ${setKRS.nim} masuk tahun ${setKRS.tahun} ");
    setKRS.pilih_matkul(null);
}