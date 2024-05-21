package eu.tutorials.kotlinbasics

fun main() {

    println("Enter first integer:")
    val num1 = readln().toInt()
    println("Enter second integer:")
    val num2 = readln().toInt()

    println("$num1 + $num2 = " + add(num1, num2))
    println("$num1 / $num2 = " + div(num1, num2))
}


fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun div(num1: Int, num2: Int): Double {
    val result = num1.toDouble() / num2.toDouble()
    return result
}