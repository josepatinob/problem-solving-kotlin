package org.example

//fun compress(chars: CharArray): Int {
//    val compressionMap = mutableMapOf<Char, Int>()
//    var i = 0
//    var j = 0
//
//    if (chars.size == 1) return 1
//
//    chars.forEach {
//        compressionMap[it] = compressionMap.getOrDefault(it, 0) + 1
//    }
//
//    val charCount = compressionMap.entries.count() * 2
//    val compressionList = compressionMap.toList()
//
//    while (i < charCount) {
//        if (compressionList[i].second == 1) {
//            chars[i] = compressionList[i].first
//        } else {
//            chars[i] = compressionList[j].first
//            if (compressionList[j].second > 10) {
//                val numbers = compressionList[j].second.toString().toCharArray()
//                for (x in numbers.indices) {
//                    chars[i] = numbers[x]
//                    i += 1
//                }
//            } else {
//                chars[i + 1] = compressionList[j].second.digitToChar(36)
//            }
//        }
//        i += 2
//        j += 1
//    }
//
//    return charCount
//}

fun compress(chars: CharArray): Int {
    var i = 0
    var res = 0
    while (i < chars.size) {
        var groupLength = 1
        while (i + groupLength < chars.size && chars[i + groupLength] == chars[i]) {
            groupLength++
        }
        chars[res++] = chars[i]
        if (groupLength > 1) {
            for (c in groupLength.toString().toCharArray()) {
                chars[res++] = c
            }
        }
        i += groupLength
    }
    return res
}