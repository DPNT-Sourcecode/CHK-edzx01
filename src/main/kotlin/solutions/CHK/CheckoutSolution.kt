package solutions.CHK

object CheckoutSolution {

    data class Item(val price: Int, val offer: Pair<Int, Int>? = null)
    val priceTable = mapOf(
        "A" to Item(50, Pair(3, 130)),
        "B" to Item(30, Pair(2,45)),
        "C" to Item(20),
        "D" to Item(15)
    )
    fun checkout(skus: String): Int {
        val skuCounts = skus.groupingBy { it }.eachCount()

        return priceTable.entries.sumOf { (sku, item) ->
            val count: Int = skuCounts[sku] ?: 0
            calculateTotal(item, count)
        }
    }

    private fun calculateTotal(item: Item, count: Int): Int {
        return  if (count ==0) 0
        else item.offer?.let { (req, offerPRice) ->
            (count / req) * offerPRice + (count % req) * item.price
        } ?: (count * item.price)
     }

}