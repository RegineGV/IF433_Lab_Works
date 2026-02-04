package oop_00000105852_RegineGabrielleViola.week01

fun main() {
    // Checkpoint 2: Refactor variables (val & String template)
    val name = "John Thor"
    val score = 80
    println("Nama: $name, Nilai: $score")

    // Checkpoint 3: Grading Logic (when expression)
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    // Checkpoint 4: Call calculateStatus
    println("Status: ${calculateStatus(score)}")

    // Checkpoint 5: Null Safety
    val studentId: String? = null
    // Elvis operator: jika null, return 0
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}

// Checkpoint 4: Function expression body (di luar main)
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"