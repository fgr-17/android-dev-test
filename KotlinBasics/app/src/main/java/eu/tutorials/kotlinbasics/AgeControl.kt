package eu.tutorials.kotlinbasics

fun main() {
    println("Enter your age as a whole number: ")

    val age : Int = readln().toInt()

    // if(age >= 18 && age < 40) {
    if(age in 18..39) {
        println("You can enter the club")
    }
    else if(age < 18){
        println("You cannot go into the club, please go home")
    }
    else {
        println("Age not verified. Please contact support.")
    }
}