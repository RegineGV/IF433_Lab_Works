package oop_00000105852_RegineGabrielleViola.week08_lab

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // Smart Cast: Jika dicek != null, compiler otomatis mengubah tipe menjadi Non-Null
        if (user.email != null) {
            sendEmail(emailAddress = user.email) // Berhasil karena Smart Cast
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}