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
}