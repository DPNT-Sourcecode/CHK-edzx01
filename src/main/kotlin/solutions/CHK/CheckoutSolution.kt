package solutions.CHK

import kotlin.jvm.internal.Intrinsics.Kotlin

object CheckoutSolution {

    fun checkout(skus: String): Int {
        var total = 0
        val counts = mutableMapOf<Char, Int>()

        for (item in skus) {
            when (item) {
                'A', 'B', 'C', 'D', 'E' -> counts[item] = counts.getOrDefault()
            }
        }
    }

}