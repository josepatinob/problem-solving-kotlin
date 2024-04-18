package org.example

fun reverseWords(s: String): String {
    val result = StringBuilder()
    val trimmedString = s.trim()

    val wordsList = trimmedString.split(" ")
    val reversedList = wordsList.reversed()

    reversedList.forEachIndexed { i, item ->
        if (item.isNotBlank()) {
            result.append(item)
            if (i != reversedList.lastIndex) {
                result.append(" ")
            }
        }
    }

    return result.toString()
}