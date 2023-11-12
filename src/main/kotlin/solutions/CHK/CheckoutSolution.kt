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

        // Handle E offers
        while (counts.getOrDefault('E', 0) >= 2) {
            total += 80
            counts['E'] = counts.getOrDefault('E', 0) - 2
            if (counts.getOrDefault('B', 0) >0) {
                counts['B'] = counts.getOrDefault('B', 0) - 1
            }
        }

        total += counts.getOrDefault('E', 0) * 40

        // Handle A offers
        total += (counts.getOrDefault('A', 0) /5)* 200
        counts['A'] = counts.getOrDefault('A', 0) % 5
        total +=  (counts.getOrDefault('A', 0) /3)* 130
        counts['A'] = counts.getOrDefault('A', 0) % 3
        total +=  (counts.getOrDefault('A', 0))* 50

        // Handle B  offers
        total += (counts.getOrDefault('B', 0) /2) * 45
        counts['B'] = counts.getOrDefault('B', 0) % 2
        total += counts.getOrDefault('B', 0) * 30

        // Handle C & D
        total += counts.getOrDefault('C', 0) * 20
        total += counts.getOrDefault('D', 0) * 15

        return total
    }

}
