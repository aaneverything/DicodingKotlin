package com.dicoding.exam.optionalexam4

fun getMiddleCharacters(string: String): String {
    if (string.isEmpty()) return ""
    val middleIndex = string.length / 2
    return if (string.length % 2 == 0) {
        "${string[middleIndex - 1]}${string[middleIndex]}"
    } else {
        "${string[middleIndex]}"
    }
}
