package eu.tutorials.kotlinbasics

fun main(){

    // Call Function
    makeCoffee(sugarCount = 1, name = "fede")
    makeCoffee(sugarCount = 2, name = "pepe")
    makeCoffee(sugarCount = 30, "Santino")
    makeCoffee(sugarCount = 0, "pepito")
    makeCoffee(sugarCount = -1, "esculapio")
}

// Define Function
fun makeCoffee(sugarCount : Int, name : String){
    if ( sugarCount == 1 ) {
        println("Coffee with 1 spoon of sugar for $name")
    }
    else if (sugarCount == 0) {
        println("Coffee with no sugar for $name")
    }
    else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}


