package solutions.HLO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloSolutionTest {
    @Test
    fun sum() {
        Assertions.assertEquals("Hello, Craftsman!", HelloSolution.hello("Craftsman"))
    }

}