package solutions.CHK

import kotlin.jvm.internal.Intrinsics.Kotlin

object CheckoutSolution {

    fun checkout(skus: String): Int {
        var total = 0
        val counts = mutableMapOf<Char, Int>()

        for (item in skus) {
            when (item) {
                'A', 'B', 'C', 'D', 'E' -> counts[item] = counts.getOrDefault(item, 0) +1
                else -> return -1
            }
        }

        while (counts.getOrDefault('E', 0) >= 2) {
            total += 80
            counts['E'] = counts.getOrDefault('E', 0) -2
            if (counts.getOrDefault('B', 0) >0) {
                counts['B'] = counts.getOrDefault('B', 0)
            }
        }

        total += counts.getOrDefault('E', 0) * 40

        // Handle A offers


    }

}