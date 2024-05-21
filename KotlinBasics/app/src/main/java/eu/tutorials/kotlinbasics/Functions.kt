package eu.tutorials.kotlinbasics

fun main(){

    // Call Function
    makeCoffee(sugarCount = 1)
    makeCoffee(sugarCount = 2)
    makeCoffee(sugarCount = 30)
    makeCoffee(sugarCount = 0)
    makeCoffee(sugarCount = -1)
}

// Define Function
fun makeCoffee(sugarCount : Int){
    if ( sugarCount == 1 ) {
        println("Coffee with 1 spoon of sugar")
    }
    else {
        println("Coffee with $sugarCount spoons of sugar")
    }
}


