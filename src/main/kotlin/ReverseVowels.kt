package org.example

fun reverseVowels(s: String): String {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val vowelsFound = ArrayDeque<Char>()
    val result = StringBuilder()
    val originalText = s.toMutableList()

    if (s.isEmpty()) return s

    originalText.forEachIndexed { i, item ->
        if (vowels.contains(item.lowercaseChar())) {
            vowelsFound.addLast(item)
            originalText[i] = '*'
        }
    }

    if (vowelsFound.isEmpty()) {
        return s
    }

    originalText.forEachIndexed { i, item ->
        if (originalText[i] == '*') {
            result.append(vowelsFound.removeLast())
        } else {
            result.append(item)
        }
    }

    return result.toString()
}