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

    // --- TUGAS MANDIRI 1: LIBRARY SYSTEM ---
    println("\n--- SISTEM PERPUSTAKAAN ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    if (scanner.hasNextInt()) {
        var days = scanner.nextInt()
        scanner.nextLine() // Consume newline

        if (days < 0) {
            println("Info: Lama pinjam tidak valid ($days), diubah otomatis menjadi 1 hari.")
            days = 1
        }

        // Buat Object Loan
        val loan = Loan(title, borrower, days)

        // Output Hasil
        println("Detail: Buku '${loan.bookTitle}' dipinjam oleh ${loan.borrower} selama ${loan.loanDuration} hari.")
        println("Total Denda: Rp ${loan.calculateFine()}")

    } else {
        println("Input hari harus angka!")
        scanner.nextLine() // Bersihkan buffer jika input salah
    }

    // --- TUGAS MANDIRI 2: MINI RPG BATTLE ---
    println("\n--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    if (scanner.hasNextInt()) {
        val heroDmg = scanner.nextInt()
        scanner.nextLine()

        val myHero = Hero(heroName, baseDamage = heroDmg)

        var enemyHp = 100

        println("BATTLE START! ${myHero.name} (HP: ${myHero.hp}) vs Enemy (HP: $enemyHp)")

        while (myHero.isAlive() && enemyHp > 0) {
            println("\nGiliran Anda:")
            println("1. Serang")
            println("2. Kabur")
            print("Pilih Aksi: ")

            val action = scanner.nextInt()
            scanner.nextLine()

            if (action == 1) {
                myHero.attack("Musuh Jahat")
                enemyHp -= myHero.baseDamage

                if (enemyHp < 0) enemyHp = 0
                println("Musuh terkena ${myHero.baseDamage} damage! (Sisa HP Musuh: $enemyHp)")

                if (enemyHp > 0) {
                    println(">> Musuh membalas serangan!")
                    val enemyDmg = (10..20).random()
                    myHero.takeDamage(enemyDmg)
                }

            } else if (action == 2) {
                println("${myHero.name} memilih untuk melarikan diri...")
                break
            } else {
                println("Aksi tidak valid! Kehilangan giliran.")
            }
        }

        println("\n--- HASIL PERTARUNGAN ---")
        if (enemyHp <= 0) {
            println("VICTORY! Musuh telah dikalahkan.")
        } else if (!myHero.isAlive()) {
            println("GAME OVER! Hero Anda telah gugur.")
        } else {
            println("Pertarungan dihentikan (Kabur).")
        }

    } else {
        println("Damage harus angka!")
    }
}