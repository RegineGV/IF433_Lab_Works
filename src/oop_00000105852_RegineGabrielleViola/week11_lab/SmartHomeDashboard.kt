package oop_00000105852_RegineGabrielleViola.week11_lab

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    // === Pencahayaan ===
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline  = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // === Keamanan ===
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline  = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // === HVAC dengan run ===
    val ac = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)

    // === Pet Care ===
    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    // === Pencarian aman ===
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // === Summary dengan with ===
    with(homeDevices) {
        println("\n=== DASHBOARD SUMMARY ===")
        println("Total perangkat terdaftar: ${this.size}")
    }

    // === Kalkulasi daya ===
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total daya terpakai: $totalPower Watt")

    // === Full Diagnostik ===
    println("\n=== DIAGNOSTIK SEMUA PERANGKAT ===")
    homeDevices.forEach { println(it.diagnose()) }
}