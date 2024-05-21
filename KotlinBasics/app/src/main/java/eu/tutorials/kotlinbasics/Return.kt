package eu.tutorials.kotlinbasics

fun main() {
    println("3 + 5 = " + add(3, 5))
}


fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}