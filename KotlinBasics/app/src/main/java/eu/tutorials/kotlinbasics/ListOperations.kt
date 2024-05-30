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

    println("========================")
    iterateList(fruitsList)

}

fun searchFruit(searchKey: String, fruitsList: List<String>) {
    if(fruitsList.contains(searchKey)) {
        println("fruits list contains ${searchKey}")
    }
    else {
        println("fruits list does NOT contains ${searchKey}")
    }
}
fun iterateList(fruitsList: List<String>) {
    for (item in fruitsList) {
        println(item)
        if(item == "pear") {
            break
        }
    }

    println("Iterate through fruit lists of ${fruitsList.size} elements")
    for(item in 0 until fruitsList.size) {
        println("fruit[${item}] : ${fruitsList[item]}")
    }

    println("Iterate using .. for range")
    for(item in 0 ..fruitsList.size - 1) {
        println("fruit[${item}] : ${fruitsList[item]}")
    }
}