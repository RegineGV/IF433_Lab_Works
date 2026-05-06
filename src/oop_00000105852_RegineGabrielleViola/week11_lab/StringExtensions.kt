package oop_00000105852_RegineGabrielleViola.week11_lab

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// Nullable receiver — aman untuk null
fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}