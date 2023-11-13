package solutions.CHK

import kotlin.jvm.internal.Intrinsics.Kotlin

object CheckoutSolution {

    fun checkout(skus: String): Int {
        var total = 0
        val counts = mutableMapOf<Char, Int>()

        for (item in skus) {
            when (item) {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' -> counts[item] =
                    counts.getOrDefault(item, 0) + 1
                else -> return -1
            }
        }

        // Handle E offers
        while (counts.getOrDefault('E', 0) >= 2) {
            total += 80
            counts['E'] = counts.getOrDefault('E', 0) - 2
            if (counts.getOrDefault('B', 0) > 0) {
                counts['B'] = counts.getOrDefault('B', 0) - 1
            }
        }
        total += counts.getOrDefault('E', 0) * 40

        // Handle F offers
        while (counts.getOrDefault('F', 0) >= 3) {
            total += 20
            counts['F'] = counts.getOrDefault('F', 0) - 3
        }
        total += counts.getOrDefault('F', 0) * 10

        // Handle H offers
        while (counts.getOrDefault('H', 0) >= 10) {
            total += 80
            counts['H'] = counts.getOrDefault('H', 0) - 10
        }
        while (counts.getOrDefault('H', 0) >= 5) {
            total += 45
            counts['H'] = counts.getOrDefault('H', 0) - 5
        }
        total += counts.getOrDefault('H', 0) * 10

        // Handle K offers
        while (counts.getOrDefault('K', 0) >= 2) {
            total += 150
            counts['K'] = counts.getOrDefault('K', 0) - 2
        }
        total += counts.getOrDefault('K', 0) * 80

        // Handle N offers
        while (counts.getOrDefault('N', 0) >= 3) {
            total += 120
            counts['N'] = counts.getOrDefault('N', 0) - 3
            if (counts.getOrDefault('M', 0) > 0) {
                counts['M'] = counts.getOrDefault('M', 0) - 1
            }
        }
        total += counts.getOrDefault('N', 0) * 40

        // Handle P offers
        while (counts.getOrDefault('P', 0) >= 5) {
            total += 200
            counts['P'] = counts.getOrDefault('P', 0) - 5
        }
        total += counts.getOrDefault('P', 0) * 50


        // Handle R offers
        while (counts.getOrDefault('R', 0) >= 3) {
            total += 150
            counts['R'] = counts.getOrDefault('R', 0) - 3
            if (counts.getOrDefault('Q', 0) > 0) {
                counts['Q'] = counts.getOrDefault('Q', 0) - 1
            }
        }
        total += counts.getOrDefault('R', 0) * 50


        // Handle Q offers
        while (counts.getOrDefault('Q', 0) >= 3) {
            total += 80
            counts['Q'] = counts.getOrDefault('Q', 0) - 3
        }
        total += counts.getOrDefault('Q', 0) * 30

        // Handle U offers
        while (counts.getOrDefault('U', 0) >= 4) {
            total += 120
            counts['U'] = counts.getOrDefault('U', 0) - 4
        }
        total += counts.getOrDefault('U', 0) * 40

        // Handle V offers
        while (counts.getOrDefault('V', 0) >= 3) {
            total += 130
            counts['V'] = counts.getOrDefault('V', 0) - 3
        }
        while (counts.getOrDefault('V', 0) >= 2) {
            total += 90
            counts['V'] = counts.getOrDefault('V', 0) - 2
        }
        total += counts.getOrDefault('V', 0) * 50

        // Handle A offers
        total += (counts.getOrDefault('A', 0) / 5) * 200
        counts['A'] = counts.getOrDefault('A', 0) % 5
        total += (counts.getOrDefault('A', 0) / 3) * 130
        counts['A'] = counts.getOrDefault('A', 0) % 3
        total += counts.getOrDefault('A', 0) * 50

        // Handle B offers
        total += (counts.getOrDefault('B', 0) / 2) * 45
        counts['B'] = counts.getOrDefault('B', 0) % 2
        total += counts.getOrDefault('B', 0) * 30

        // Handle C and D
        total += counts.getOrDefault('C', 0) * 20
        total += counts.getOrDefault('D', 0) * 15

        // Handle G, I, J, L, O, S, T, W, X, Y, Z
        total += counts.getOrDefault('G', 0) * 20
        total += counts.getOrDefault('I', 0) * 35
        total += counts.getOrDefault('J', 0) * 60
        total += counts.getOrDefault('L', 0) * 90
        total += counts.getOrDefault('M', 0) * 15
        total += counts.getOrDefault('O', 0) * 10
        total += counts.getOrDefault('S', 0) * 30
        total += counts.getOrDefault('T', 0) * 20
        total += counts.getOrDefault('W', 0) * 20
        total += counts.getOrDefault('X', 0) * 90
        total += counts.getOrDefault('Y', 0) * 10
        total += counts.getOrDefault('Z', 0) * 50

        return total
    }

}
