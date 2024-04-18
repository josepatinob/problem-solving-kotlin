package org.example

fun productExceptSelf(nums: IntArray): IntArray {
    val lengthOfArray = nums.size
    val lastIndex = lengthOfArray - 1
    val resultArray = IntArray(lengthOfArray)
    val leftProducts = IntArray(lengthOfArray)
    val rightProducts = IntArray(lengthOfArray)

    leftProducts[0] = 1
    rightProducts[lastIndex] = 1

    for (i in 1..lastIndex) {
        leftProducts[i] = nums[i - 1] * leftProducts[i - 1]
    }

    for (i in lengthOfArray - 2 downTo 0) {
        rightProducts[i] = nums[i + 1] * rightProducts[i + 1]
    }

    for (i in 0..lastIndex) {
        resultArray[i] = leftProducts[i] * rightProducts[i]
    }

    return resultArray
}