package oop_00000105852_RegineGabrielleViola.week12_lec

fun basic_trycatch(pembilang:Int, penyebut:Int){
    try{
        val hasil = pembilang/penyebut
        println("Hasil bagi $hasil")
    }catch(ex:Exception){
        println("Ada error pembagian ${ex.message}")
    }finally{
        println("Selesai pembagian")
    }
}

fun cek_tipe_data(angka: String){
    var nilai:Int = try {
        Integer.parseInt(angka)
    }catch (e: Exception){
        println("ada error di cek tipe data ${e.message}")
        123
    }
    println("Nilai kamu: $nilai")
}

fun cek_gaji(hariKerja: Int){
    if(hariKerja < 0){
        throw IllegalArgumentException("Masa Hari kerja minus")
    }else{
        val gaji = hariKerja * 100
        println("Gaji kamu: $gaji")
    }
}

class cekSaldoBank(val saldoKamu:Int, val jajanKamu:Int):
        Exception("Saldo kamu $saldoKamu, jajan kamu $jajanKamu, gak cukup lah!!!")

class transaksi_pembelian(val saldoAwal:Int) {
    fun mulai_jajan(pengeluaranKamu:Int){
        if(saldoAwal < pengeluaranKamu){
            throw cekSaldoBank(saldoAwal, pengeluaranKamu)
        } else {
            val sisaSaldo = saldoAwal - pengeluaranKamu
            println("Sisa saldo kamu: $sisaSaldo")
        }
    }
}

fun main() {
    val trxBeli = transaksi_pembelian(1000)
    try {
        trxBeli.mulai_jajan(1300)
    } catch (e: Exception){
        println ("ada error di custom exception :::: ${e.message}")
    }

    //coba throw
    try {
        cek_gaji(-1)
    } catch (e: Exception) {
        println("Error coba catch ::: ${e.message}")
    }

    //exception - expression
    cek_tipe_data(angka = "abc")

    //basic exception
    basic_trycatch(10,0)
}