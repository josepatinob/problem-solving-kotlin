package org.example

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    var greatestCandieAmount = -1
    val result = mutableListOf<Boolean>()
    for (amount: Int in candies) {
        if (greatestCandieAmount < amount) {
            greatestCandieAmount = amount
        }
    }

    candies.forEach {
        val finalCandyCount = it + extraCandies
        if (finalCandyCount >= greatestCandieAmount) {
            result.add(true)
        } else {
            result.add(false)
        }
    }

    return result
}