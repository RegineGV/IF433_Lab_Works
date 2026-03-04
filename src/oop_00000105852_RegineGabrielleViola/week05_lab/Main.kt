package oop_00000105852_RegineGabrielleViola.week05_lab

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------------")
    }

    // --- Tugas 1 ---
    println("\n=== TESTING MATHHELPER (TASK 1) ===")
    val helper = MathHelper()
    println("Luas Persegi (sisi 5): ${helper.hitungLuas(5)}")
    println("Luas Persegi Panjang (10x5): ${helper.hitungLuas(10, 5)}")
    println("Luas Lingkaran (r 7.0): ${helper.hitungLuas(7.0)}")
}