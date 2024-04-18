package org.example

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var possiblePlantLocations = 0
    val updatedFlowerbed = flowerbed.toMutableList()

    if (n == 0) return true

    if (flowerbed.size == 1 && flowerbed[0] != 1) return true

    if (updatedFlowerbed[0] == 0 && updatedFlowerbed[1] == 0) {
        possiblePlantLocations += 1
        updatedFlowerbed[0] = 1
    }

    if (updatedFlowerbed[flowerbed.size - 1] == 0 && updatedFlowerbed[flowerbed.size - 2] == 0) {
        possiblePlantLocations += 1
        updatedFlowerbed[flowerbed.size - 1] = 1
    }

    if (possiblePlantLocations >= n) return true

    for (i in 0..<flowerbed.size - 2) {
        if (updatedFlowerbed[i] == 1) continue

        if ((updatedFlowerbed[i] == 0 && updatedFlowerbed[i + 2] == 0) && updatedFlowerbed[i + 1] != 1) {
            possiblePlantLocations += 1
            updatedFlowerbed[i + 1] = 1
        }

        if (possiblePlantLocations == n) {
            return true
        }
    }

    return false
}