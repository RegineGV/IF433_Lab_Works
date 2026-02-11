package oop_00000105852_RegineGabrielleViola.week02_lab

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine() // Bersihkan buffer newline

    // Validasi NIM
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        if (scanner.hasNextInt()) {
            val type = scanner.nextInt()
            scanner.nextLine()

            if (type == 1) {
                print("Masukkan Jurusan: ")
                val major = scanner.nextLine()

                val s1 = Student(name, nim, major) // Primary Constructor [cite: 83-84]
                println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

            } else if (type == 2) {
                val s2 = Student(name, nim) // Secondary Constructor [cite: 87]
                println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

            } else {
                println("Pilihan ngawur, pendaftaran batal!")
            }
        } else {
            println("Input harus angka!")
        }
    }
    println("Status: Pendaftaran Selesai.")
}