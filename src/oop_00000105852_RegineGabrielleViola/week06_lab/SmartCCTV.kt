package oop_00000105852_RegineGabrielleViola.week06_lab

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun startRecord() {
        println("CCTV '$name' mulai merekam aktivitas ke hard drive.")
    }

    override fun turnOn() {
        println("CCTV '$name' dihidupkan.")
        startRecord() // Wajib memanggil fungsi merekam secara otomatis
    }

    override fun turnOff() {
        println("CCTV '$name' dimatikan.")
        stopRecord()
    }
}