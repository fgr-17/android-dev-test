package eu.tutorials.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main(){

    var coffeForDenis = CoffeeDetails(1, "denis", "xxl", 0)

    makeCoffee(coffeForDenis)

/*
    // Call Function
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    makeCoffee(sugarCountInt, name)

    makeCoffee(1, "fede")
    makeCoffee(2, "pepe")
    makeCoffee(30, "Santino")
    makeCoffee(0, "pepito")
    makeCoffee(-1, "esculapio")*/
}

// Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails){
    if ( coffeeDetails.sugarCount == 1 ) {
        println("Coffee with 1 spoon of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }
    else if (coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }
    else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }
}


