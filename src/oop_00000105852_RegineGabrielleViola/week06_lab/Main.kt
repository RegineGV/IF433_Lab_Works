package oop_00000105852_RegineGabrielleViola.week06_lab

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)


    println("\n=== SMART HOME INSTANTIATION (TASK) ===")
    val livingRoomLamp = SmartLamp("LAMP-01", "Lampu Ruang Tamu")
    val kitchenSpeaker = SmartSpeaker("SPK-01", "Speaker Dapur")
    val garageCCTV = SmartCCTV("CCTV-01", "CCTV Garasi")
}

