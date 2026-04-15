package oop_00000105852_RegineGabrielleViola.week08_lab

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        // Mengembalikan User jika ID adalah 1, selain itu null [cite: 170]
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }

    fun runMockUnitTest() {
        println("\n=== RUNNING UNIT TEST ===")
        val testUser = DatabaseMock.findUser(1)

        // Di Unit Testing, jika user null, kita HARAP testnya gagal (crash).
        // Maka penggunaan !! sangat lazim di file Testing.
        val initial = testUser!!.name.substring(0, 1)

        // check() adalah fungsi bawaan Kotlin untuk assertion
        check(initial == "T") { "Test Failed! Initial is wrong." }
        println("Test Passed: Initial is T")
    }
}