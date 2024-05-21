package eu.tutorials.kotlinbasics

class Dog (val name: String, val breed: String, var age: Int = 0) {

    init {
        bark()
    }

    fun bark() {
        println("$name guau guau")
    }

}