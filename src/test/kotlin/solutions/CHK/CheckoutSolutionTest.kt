package solutions.CHK

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CheckoutSolutionTest {

    @Test
    fun `empty basket returns 0`() {
        assertEquals(0, CheckoutSolution.checkout(""))
    }

    @Test
    fun `single item A returns correct price`() {
        assertEquals(50, CheckoutSolution.checkout("A"))
    }

    @Test
    fun `two items A returns correct price`() {
        assertEquals(100, CheckoutSolution.checkout("AA"))
    }

    @Test
    fun `three items A returns correct price with 3A special offer`() {
        assertEquals(130, CheckoutSolution.checkout("AAA"))
    }

    @Test
    fun `four items A returns correct price with 3A special offer applied twice`() {
        assertEquals(180, CheckoutSolution.checkout("AAAA"))
    }

    @Test
    fun `one items B returns correct price`() {
        assertEquals(30, CheckoutSolution.checkout("B"))
    }
    @Test
    fun `two items B returns correct price`() {
        assertEquals(45, CheckoutSolution.checkout("BB"))
    }

    @Test
    fun `three items B returns correct price with 2B special offer`() {
        assertEquals(75, CheckoutSolution.checkout("BBB"))
    }

    @Test
    fun `one items C returns correct price`() {
        assertEquals(20, CheckoutSolution.checkout("C"))
    }

    @Test
    fun `five items C returns correct price`() {
        assertEquals(100, CheckoutSolution.checkout("CCCCC"))
    }

    @Test
    fun `five items D returns correct price`() {
        assertEquals(75, CheckoutSolution.checkout("DDDDD"))
    }

    @Test
    fun `five items Dd returns correct price`() {
        assertEquals(60, CheckoutSolution.checkout("DDDD"))
    }

    @Test
    fun `mixed items returns correct total`() {
        assertEquals(150, CheckoutSolution.checkout("ABCA"))
    }

    @Test
    fun `multiple mixed items returns correct total`() {
        assertEquals(180, CheckoutSolution.checkout("ABACA"))
    }

    @Test
    fun `multiple(2) mixed items returns correct total`() {
        assertEquals(195, CheckoutSolution.checkout("ABBACA"))
    }

    @Test
    fun `invalid input returns -1`() {
        assertEquals(-1, CheckoutSolution.checkout("X"))
    }

}

