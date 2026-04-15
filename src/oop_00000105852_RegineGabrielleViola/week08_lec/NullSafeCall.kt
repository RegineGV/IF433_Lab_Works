package oop_00000105852_RegineGabrielleViola.week08_lec

class Alamat(val nomor:String, val kota:String)
class Mahasiswa(val nama:String, val addr: Alamat?)

fun main() {
    val alm = Alamat(nomor = "47", kota = "Tangerang");
    val mhs = Mahasiswa(nama = "Rere", addr = alm);

    val defKota = mhs.addr?.let{
        alamatDefault->"TinGGal di ${mhs.addr.kota} nomor ${mhs.addr.nomor}"
    }?:"Tidak tau tinggal dimana";

    println("hai ${mhs.nama} kamu tinggal di ${defKota}");
}