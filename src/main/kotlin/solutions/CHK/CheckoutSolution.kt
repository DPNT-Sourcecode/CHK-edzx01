package solutions.CHK

object CheckoutSolution {

    data class Item(val price: Int, val offer: Pair<Int, Int>? = null)
    val priceTable = mapOf(
        "A" to Item(50, Pair(3, 130)),
        "B" to Item(30, Pair()),
        "C" to Item(20),
    )
    fun checkout(skus: String): Int {

    }

}
