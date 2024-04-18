package org.example

fun moveZeroes(nums: IntArray) {
    var i = 0
    var j = 1

    if (nums.size == 1) return

    while(i < nums.size - 1 && j < nums.size) {
        if (nums[i] == 0 && nums[j] != 0) {
            swap(nums, i, j)
            i++
            j++
        } else if (nums[i] == 0 && nums[j] == 0) {
            j++
        } else {
            i++
            j++
        }
    }
}

private fun swap(numbers: IntArray, i: Int, j: Int) {
    val temp = numbers[j]
    numbers[j] = numbers[i]
    numbers[i] = temp
}