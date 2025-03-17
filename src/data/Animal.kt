package data

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

class Cat: Animal(){
    override val name: String = "Cat"

    override fun run() {
        println("${name} run...")
    }
}

class Doge: Animal(){
    override val name: String = "Doge"

    override fun run() {
        println("${name} run...")
    }
}