package eu.tutorials.kotlinbasics

fun main() {
    var daisy = Dog("Daisy", "Lassie", 4)
    println("Dog name: ${daisy.name} of breed: ${daisy.breed} and is ${daisy.age} years old")
    daisy.age = 5
    println("A year has passed!")
    println("Dog name: ${daisy.name} of breed: ${daisy.breed} and is ${daisy.age} years old")
}