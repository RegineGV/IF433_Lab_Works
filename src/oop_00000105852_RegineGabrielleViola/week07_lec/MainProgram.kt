package oop_00000105852_RegineGabrielleViola.week07_lec

fun main() {
    val koneksi = Koneksi()

    println("Server: " + koneksi.alamatServer)
    koneksi.konek_db()

    println("Kampus: " + Hitungan.namaKampus)
    println("Nomor: " + Hitungan.noIndukKampus)
    println("Tambahan: " + Hitungan.penambahan(a=10, b=20))
}