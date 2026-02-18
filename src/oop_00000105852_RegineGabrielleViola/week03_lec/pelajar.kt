package oop_00000105852_RegineGabrielleViola.week03_lec

class Pelajar {
    private var nama: String = "belum ada nama"
    private var nilai: Int = 0

    fun set_nama(namaorang: String) {
        if (namaorang.length < 0) {
            println("eh nama orang ga boleh kosong")
        } else {
            this.nama = namaorang
        }
    }

    fun get_nama(): String {
        return this.nama
    }

    fun set_nilai(nilaisiswa: Int) {
        if (nilaisiswa < 0) {
            println("eh ga boleh minus")
        } else {
            this.nilai = nilaisiswa
        }
    }

    fun get_nilai(): Int {
        return this.nilai
    }
}

fun main() {
    val mahasiswa = Pelajar()
    mahasiswa.set_nama("Budi")
    mahasiswa.set_nilai(20)

    println("Nama kamu: ${mahasiswa.get_nama()}")
    println("Nilai kamu: ${mahasiswa.get_nilai()}")
}
