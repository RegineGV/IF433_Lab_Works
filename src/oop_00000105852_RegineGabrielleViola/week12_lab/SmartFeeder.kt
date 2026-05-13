package oop_00000105852_RegineGabrielleViola.week12_lab

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    // Jadwal makan pagi
    println("=== JADWAL MAKAN PAGI ===")
    try {
        val newStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = newStock
        println("Sisa stok kibble: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("ERROR HARDWARE: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR STOK: ${e.message}")
    } catch (e: Exception) {
        println("ERROR UMUM: ${e.message}")
    } finally {
    println("Siklus pengecekan dispenser pagi selesai.")
    }

    // Jadwal makan sore
    println("\n=== JADWAL MAKAN SORE ===")
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }
}