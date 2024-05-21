package eu.tutorials.kotlinbasics

fun main() {
    val myBook = Book()
    myBook.printProperties()
    val customBook = Book("Rayuela", "Cortazar", 1963)
    customBook.printProperties()
}