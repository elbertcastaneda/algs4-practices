package algs4_practices

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AppTestKt {

    @Test
    fun testAppHasAGreetingKt() {
        val classUnderTest = App()

        assertTrue(classUnderTest.toString().startsWith("algs4_practices.App"))
    }
}
