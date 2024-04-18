package org.example

fun main() {
    /* Next Permutation Tests */
    val array1 = intArrayOf(1, 2, 3)
    nextPermutation(array1)
    println(array1.contentToString())

    val array2 = intArrayOf(3,2,1)
    nextPermutation(array2)
    println(array2.contentToString())

    val array3 = intArrayOf(1,1,5)
    nextPermutation(array3)
    println(array3.contentToString())

    val array4 = intArrayOf(1,3,2)
    nextPermutation(array4)
    println(array4.contentToString())
}