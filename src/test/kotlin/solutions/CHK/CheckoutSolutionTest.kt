package solutions.CHK


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckoutSolution5Test {

    @Test
    fun `empty basket returns 0`() {
        assertEquals(0, CheckoutSolution.checkout(""))
    }

    @Test
    fun `invalid input AxA`() {
        assertEquals(-1, CheckoutSolution.checkout("AxA"))
    }
    @Test
    fun `invalid input with digits`() {
        assertEquals(-1, CheckoutSolution.checkout("1"))
    }
    @Test
    fun `invalid input with special characters`() {
        assertEquals(-1, CheckoutSolution.checkout("&"))
    }

    @Test
    fun `single item A`() {
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
    fun `four B`() {
        assertEquals(90, CheckoutSolution.checkout("BBBB"))
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
    fun `four F`() {
        assertEquals(30, CheckoutSolution.checkout("FFFF"))
    }
    @Test
    fun `seven F`() {
        assertEquals(50, CheckoutSolution.checkout("FFFFFFF"))
    }

    @Test
    fun `one G`() {
        assertEquals(20, CheckoutSolution.checkout("G"))
    }
    @Test
    fun `two G`() {
        assertEquals(40, CheckoutSolution.checkout("GG"))
    }

    @Test
    fun `one H`() {
        assertEquals(10, CheckoutSolution.checkout("H"))
    }
    @Test
    fun `five H`() {
        assertEquals(45, CheckoutSolution.checkout("HHHHH"))
    }
    @Test
    fun `ten H`() {
        assertEquals(80, CheckoutSolution.checkout("HHHHHHHHHH"))
    }

    @Test
    fun `one I`() {
        assertEquals(35, CheckoutSolution.checkout("I"))
    }
    @Test
    fun `one J`() {
        assertEquals(60, CheckoutSolution.checkout("J"))
    }

    @Test
    fun `one K`() {
        assertEquals(70, CheckoutSolution.checkout("K"))
    }
    @Test
    fun `two K`() {
        assertEquals(120, CheckoutSolution.checkout("KK"))
    }

    @Test
    fun `one L`() {
        assertEquals(90, CheckoutSolution.checkout("L"))
    }

    @Test
    fun `one M`() {
        assertEquals(15, CheckoutSolution.checkout("M"))
    }

    @Test
    fun `one N`() {
        assertEquals(40, CheckoutSolution.checkout("N"))
    }

    @Test
    fun `three N`() {
        assertEquals(120, CheckoutSolution.checkout("NNN"))
    }


    @Test
    fun `mixed items ABCA`() {
        assertEquals(150, CheckoutSolution.checkout("ABCA"))
    }

    @Test
    fun `mixed items ABCAF`() {
        assertEquals(160, CheckoutSolution.checkout("ABCAF"))
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
    fun `long input with repeating items`() {
        assertEquals(280, CheckoutSolution.checkout("ABCDEABCDE"))
    }

    @Test
    fun `long mixed input`() {
        assertEquals(280, CheckoutSolution.checkout("CCADDEEBBA"))
    }

    @Test
    fun `single item B`() {
        assertEquals(30, CheckoutSolution.checkout("B"))
    }

    @Test
    fun `two B with special offer`() {
        assertEquals(45, CheckoutSolution.checkout("BB"))
    }

    @Test
    fun `single item E`() {
        assertEquals(40, CheckoutSolution.checkout("E"))
    }

    @Test
    fun `two E plus one B with special offer`() {
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
    fun `five H with special offer`() {
        assertEquals(45, CheckoutSolution.checkout("HHHHH"))
    }

    @Test
    fun `ten H with second special offer`() {
        assertEquals(80, CheckoutSolution.checkout("HHHHHHHHHH"))
    }


    @Test
    fun `three N with offer`() {
        assertEquals(120, CheckoutSolution.checkout("NNNM"))
    }

    @Test
    fun `one O`() {
        assertEquals(10, CheckoutSolution.checkout("O"))
    }

    @Test
    fun `one P`() {
        assertEquals(50, CheckoutSolution.checkout("P"))
    }

    @Test
    fun `five P with special offer`() {
        assertEquals(200, CheckoutSolution.checkout("PPPPP"))
    }

    @Test
    fun `three Q with special offer`() {
        assertEquals(80, CheckoutSolution.checkout("QQQ"))
    }

    @Test
    fun `three R with special offer`() {
        assertEquals(150, CheckoutSolution.checkout("RRRQ"))
    }

    @Test
    fun `one S`() {
        assertEquals(20, CheckoutSolution.checkout("S"))
    }

    @Test
    fun `one T`() {
        assertEquals(20, CheckoutSolution.checkout("T"))
    }

    @Test
    fun `three U with special offer`() {
        assertEquals(120, CheckoutSolution.checkout("UUUU"))
    }

    @Test
    fun `two V with first special offer`() {
        assertEquals(90, CheckoutSolution.checkout("VV"))
    }

    @Test
    fun `three V with second special offer`() {
        assertEquals(130, CheckoutSolution.checkout("VVV"))
    }

    @Test
    fun `one W`() {
        assertEquals(20, CheckoutSolution.checkout("W"))
    }

    @Test
    fun `one X`() {
        assertEquals(17, CheckoutSolution.checkout("X"))
    }

    @Test
    fun `one Y`() {
        assertEquals(20, CheckoutSolution.checkout("Y"))
    }

    @Test
    fun `one Z`() {
        assertEquals(21, CheckoutSolution.checkout("Z"))
    }

    @Test
    fun `combination STX for 45`() {
        assertEquals(45, CheckoutSolution.checkout("STX"))
    }

    @Test
    fun `combination XYZ for 45`() {
        assertEquals(45, CheckoutSolution.checkout("XYZ"))
    }

}