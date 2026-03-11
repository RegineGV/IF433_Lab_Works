package oop_00000105852_RegineGabrielleViola.week06_lab

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\nMematikan semua saklar perangkat:")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}