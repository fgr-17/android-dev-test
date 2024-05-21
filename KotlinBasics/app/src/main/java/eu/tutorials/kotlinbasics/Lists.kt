package eu.tutorials.kotlinbasics

fun main() {

    // Immutable list
    val shoppingList1 = listOf("RAM 16", "processor", "ssd")
    // Mutable list
    val shoppingList2 = mutableListOf<String>("RAM", "processor", "ssd")

    shoppingList2.add("Cooler")
    shoppingList2.remove("RAM")
    shoppingList2.add("RAM 32")

    println(shoppingList2)
    // removing by index
    shoppingList2.removeAt(2)
    println(shoppingList2)
    shoppingList2.add(0, "RAM 64")
    println(shoppingList2)
    println("Showing item 3: ${shoppingList2[3]}")
    shoppingList2[3] = "RAM 128"
    println(shoppingList2)
}