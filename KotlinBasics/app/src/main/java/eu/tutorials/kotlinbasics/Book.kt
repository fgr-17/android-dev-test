package eu.tutorials.kotlinbasics

class Book (val title: String = "Unknown", val author: String = "Anonymous", val yearPublished: Int = 2024){

    init {

    }

    fun printProperties() {
        println("Title: $title")
        println("Author: $author")
        println("Year Published: $yearPublished")
    }
}