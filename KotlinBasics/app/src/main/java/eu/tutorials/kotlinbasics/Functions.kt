package eu.tutorials.kotlinbasics

fun main(){

    // Call Function
    makeCoffee(1, "fede")
    makeCoffee(2, "pepe")
    makeCoffee(30, "Santino")
    makeCoffee(0, "pepito")
    makeCoffee(-1, "esculapio")
}

// Define Function
fun makeCoffee(sugarCount:Int, name:String){
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


