package oop_00000105852_RegineGabrielleViola.week02_lab

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0, //<-- Default Argument
) {
    init {
        // Validasi Sederhana: Cek panjang NIM [cite: 31]
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    // Secondary Constructor
    // Wajib memanggil Primary Constructor pakai 'this()'
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}