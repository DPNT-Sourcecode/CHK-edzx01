package solutions.CHK

import kotlin.jvm.internal.Intrinsics.Kotlin

object CheckoutSolution {

    fun checkout(skus: String): Int {
        val prices = mapOf( 'A' to 50, 'B' to 30, 'C' to 20, 'D' to 15 )
        val offers = mapOf('A' to Pair(3, 130), 'B' to Pair(2,45))

        var total = 0
        val counts = mutableMapOf<Char, Int>()

        for (sku in skus) {
            if (!prices.containsKey(sku)) return -1

            counts[sku] = counts.getOrDefault(sku, 0) + 1
            total += prices[sku]!!

            if (offers.containsKey(sku) && counts[sku]!! % offers[sku]!!.first == 0) {
                total -= (offers[sku]!!.first -1 ) * prices[sku]!!
                total += offers[sku]!!.second - prices[sku]!!
            }
        }
        return  total
    }

}