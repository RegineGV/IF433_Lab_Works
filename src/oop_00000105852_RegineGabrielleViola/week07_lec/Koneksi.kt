package oop_00000105852_RegineGabrielleViola.week07_lec

class Koneksi {
    var alamatServer:String = "http://localhost:8080";

    fun konek_db() {
        println("Konek ke DB saya di $alamatServer");
    }
}