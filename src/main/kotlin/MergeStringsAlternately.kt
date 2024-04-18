package org.example

fun mergeAlternately(word1: String, word2: String): String {
    val answer = StringBuilder()

    if (word1.length == word2.length) {
        word1.forEachIndexed { index, c ->
            answer.append(c)
            answer.append(word2[index])
        }
    } else if (word1.length > word2.length) {
        word1.forEachIndexed { index, c ->
            answer.append(c)
            if (index < word2.length) {
                answer.append(word2[index])
            }
        }
    } else {
        word2.forEachIndexed { index, c ->
            if (index < word1.length) {
                answer.append(word1[index])
            }
            answer.append(c)
        }
    }

    return answer.toString()
}