package solutions.CHK


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckoutSolution2Tests {

    @Test
    fun `empty basket returns 0`() {
        assertEquals(0, CheckoutSolution.checkout(""))
    }

    @Test
    fun `invalid input returns -1`() {
        assertEquals(-1, CheckoutSolution.checkout("X"))
    }
    @Test
    fun `invalid AxA`() {
        assertEquals(-1, CheckoutSolution.checkout("AxA"))
    }


    @Test
    fun `single item A returns correct price`() {
        assertEquals(50, CheckoutSolution.checkout("A"))
    }

    @Test
    fun `two A`() {
        assertEquals(100, CheckoutSolution.checkout("AA"))
    }

    @Test
    fun `three A`() {
        assertEquals(130, CheckoutSolution.checkout("AAA"))
    }

    @Test
    fun `four A returns correct price with 3A special offer applied once`() {
        assertEquals(180, CheckoutSolution.checkout("AAAA"))
    }

    @Test
    fun `five A returns correct price with 5A special offer applied once`() {
        assertEquals(200, CheckoutSolution.checkout("AAAAA"))
    }

    @Test
    fun `ten A returns correct price with 5A special offer applied twice`() {
        assertEquals(400, CheckoutSolution.checkout("AAAAAAAAAA"))
    }

    @Test
    fun `one B`() {
        assertEquals(30, CheckoutSolution.checkout("B"))
    }

    @Test
    fun `two B returns correct price with 2B special offer`() {
        assertEquals(45, CheckoutSolution.checkout("BB"))
    }

    @Test
    fun `three items B returns correct price with 2B special offer`() {
        assertEquals(75, CheckoutSolution.checkout("BBB"))
    }

    @Test
    fun `one C`() {
        assertEquals(20, CheckoutSolution.checkout("C"))
    }

    @Test
    fun `five C`() {
        assertEquals(100, CheckoutSolution.checkout("CCCCC"))
    }

    @Test
    fun `five D`() {
        assertEquals(75, CheckoutSolution.checkout("DDDDD"))
    }

    @Test
    fun `one E`() {
        assertEquals(40, CheckoutSolution.checkout("E"))
    }

    @Test
    fun `two E`() {
        assertEquals(80, CheckoutSolution.checkout("EE"))
    }

    @Test
    fun `two Es plus one B`() {
        assertEquals(80, CheckoutSolution.checkout("EEB"))
    }

    @Test
    fun `one F`() {
        assertEquals(10, CheckoutSolution.checkout("F"))
    }
    @Test
    fun `two F`() {
        assertEquals(20, CheckoutSolution.checkout("FF"))
    }

    @Test
    fun `three F`() {
        assertEquals(20, CheckoutSolution.checkout("FFF"))
    }

    @Test
    fun `four F`() {
        assertEquals(30, CheckoutSolution.checkout("FFFF"))
    }
    @Test
    fun `seven F`() {
        assertEquals(50, CheckoutSolution.checkout("FFFFFFF"))
    }

    @Test
    fun `mixed items ABCA`() {
        assertEquals(150, CheckoutSolution.checkout("ABCA"))
    }

    @Test
    fun `mixed items ABACA with 3A special offer applied`() {
        assertEquals(180, CheckoutSolution.checkout("ABACA"))
    }

    @Test
    fun `mixed items AAAAAEEBAAABB`() {
        assertEquals(455, CheckoutSolution.checkout("AAAAAEEBAAABB"))
    }

    @Test
    fun `mixed items AAAAAEEBAAAFBBFF`() {
        assertEquals(475, CheckoutSolution.checkout("AAAAAEEBAAAFBBFF"))
    }

    @Test
    fun `mixed items AAAAABAAABB`() {
        assertEquals(405, CheckoutSolution.checkout("AAAAABAAABB"))
    }
    @Test
    fun `mixed items ABCDECBAABCABBAAAEEAA`() {
        assertEquals(665,CheckoutSolution.checkout("ABCDECBAABCABBAAAEEAA"))
    }

    @Test
    fun `invalid input with digits returns -1`() {
        assertEquals(-1, CheckoutSolution.checkout("1"))
    }

    @Test
    fun `invalid input with special characters returns -1`() {
        assertEquals(-1, CheckoutSolution.checkout("&"))
    }

    @Test
    fun `two E plus one B`() {
        assertEquals(80, CheckoutSolution.checkout("EEB"))
    }

    @Test
    fun `three E plus one B`() {
        assertEquals(120, CheckoutSolution.checkout("EEEB"))
    }

    @Test
    fun `four E plus two B`() {
        assertEquals(160, CheckoutSolution.checkout("EEEEBB"))
    }

    @Test
    fun `mixed items with multiple Es and Bs`() {
        assertEquals(160, CheckoutSolution.checkout("BEBEEE"))
    }

    @Test
    fun `four B`() {
        assertEquals(90, CheckoutSolution.checkout("BBBB"))
    }

    @Test
    fun `long input with repeating items`() {
        assertEquals(280, CheckoutSolution.checkout("ABCDEABCDE"))
    }

    @Test
    fun `long mixed input`() {
        assertEquals(280, CheckoutSolution.checkout("CCADDEEBBA"))
    }


}




