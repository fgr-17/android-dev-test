package eu.tutorials.kotlinbasics

fun main() {
    println("Please enter a number:")
    val inputString : String = readln()
    var inputNumber : Int = inputString.toInt()

    val multiplier = 5
    println("Result of operation is: " + inputNumber * multiplier)
}