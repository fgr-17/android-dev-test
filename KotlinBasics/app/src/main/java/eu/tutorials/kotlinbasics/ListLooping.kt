package eu.tutorials.kotlinbasics

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    println("list of numbers: ${numbers}")

    for(index in 0 until numbers.size) {
        numbers[index] = numbers[index] * 2
        println("number[${index}] : ${numbers[index]}")
    }

}