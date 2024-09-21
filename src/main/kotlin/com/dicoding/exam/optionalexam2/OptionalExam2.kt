package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val digits = number.toString().map { it.toString().toInt() }
    val minDigit = digits.minOrNull() ?: throw IllegalArgumentException("Number must have at least 2 digits")
    val maxDigit = digits.maxOrNull() ?: throw IllegalArgumentException("Number must have at least 2 digits")
    return minDigit + maxDigit
}
