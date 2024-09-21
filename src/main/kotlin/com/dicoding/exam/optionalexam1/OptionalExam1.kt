package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val final = numbers.sortedDescending().take(3)
    return final.sum()
}
