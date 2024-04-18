package org.example

fun increasingTriplet(nums: IntArray): Boolean {
    var firstNum = Int.MAX_VALUE
    var secondNum = Int.MAX_VALUE
    for (n in nums) {
        if (n <= firstNum) {
            firstNum = n
        } else if (n <= secondNum) {
            secondNum = n
        } else {
            return true
        }
    }
    return false
}