package oop_00000105852_RegineGabrielleViola.week09_lec

fun main() {
    println("============== LIST OF INPUT ==============")
    val arSiswa = listOf("Ali", "Budi", "Cica");
    println(arSiswa)
    println("nama siswa:" + arSiswa[1]);
    println("banyak siswa :" + arSiswa.size);
    for(i in arSiswa) {
        println("ini siswa nya: " + i)
    }

    println ("============== LIST OF MUTABLE ==============")
    val arMatkul = mutableListOf("OOP", "MatDis", "GameDev");
    arMatkul.add("Kalkulus");
    arMatkul[2] = "Pemweb";
    arMatkul.remove( element = "MatDis");
    println(arMatkul);

    println("============== LIST OF IMUTABLE ==============");
    var arNilai = setOf(80, 90, 20, 30, 90, 70, 20, 10, 100);
    println("banyak data: + ${arNilai.size}");
    println("angka 20 ada ga? ${arNilai.contains(20)}");
    println(arNilai);

    println("============== SET OF MUTABLE ==============")
    var arMakanan = mutableSetOf("Nasi goreng", "Tempe", "Tahu", "Bapkao", "Tahu", "Ayam");
    arMakanan.add( "Mie");
    arMakanan.remove( "Tahu");
    arMakanan.add("Tempe");
    println(arMakanan);

    println("============== MAP IMUTABLE ==============");
    var arDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 90,
        "Udin" to 83
    );
    println("Banyak data: + ${arDataMhs.size}");
    println("Si Acong nilainya: ${arDataMhs["Acong"]}");
    println("List Semua Mahasiswa: ${arDataMhs.keys}");
    println("List Semua Nilai: ${arDataMhs.values}");
    println(arDataMhs);

    println("============== MAP MUTABLE ==============");
    var arMenuResto = mutableMapOf(
        "Mie ayam" to 5000,
        "Mie bakso" to 6000,
        "Mie Pangsit" to 6500
    )
    arMenuResto["Mie bakso"] = 6200;
    arMenuResto.remove( key = "Mie ayam");
    println(arMenuResto);

    println("============== LAMBDA ==============");
    fun tambah(a:Int, b:Int):Int {
        return a+b;
    }
    println("Hasil tambah ${tambah(10, 3)}");
    var kurang = {a:Int, b:Int -> a-b};
    println("Hasil kurang ${kurang(10,3)}");

    println("============== LAMBDA ( IT ) ==============");
    val pangkat = {a:Int -> a*a}
    val hitungPangkat:(Int) -> Int = {it*it}
    println("Hasil pangkat adalah ${hitungPangkat(5)}");

    println("============== FOREACH ==============")
    for(a in arMakanan){
        println(a);
    }

    println ("============== FOREACH ( IT ) ==============")
    arMakanan.forEach {
        println(it);
    }

    println ("============== FOREACH { variable } ==============")
    arMakanan.forEach {
        mkn -> println(mkn);
    }
}