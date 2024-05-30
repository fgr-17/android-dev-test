package eu.tutorials.kotlinbasics

import java.nio.channels.spi.AbstractSelectionKey

fun main() {
    val fruitsList = mutableListOf<String>("apple", "orange", "pear")
    println("fruits list: ${fruitsList}")

    fruitsList.add("pineapple")
    println("fruits list: ${fruitsList}")

    fruitsList.remove("orange")
    println("fruits list: ${fruitsList}")

    searchFruit("apple", fruitsList)
    searchFruit("banana", fruitsList)

}

fun searchFruit(searchKey: String, fruitsList: List<String>) {
    if(fruitsList.contains(searchKey)) {
        println("fruits list contains ${searchKey}")
    }
    else {
        println("fruits list does NOT contains ${searchKey}")
    }
}