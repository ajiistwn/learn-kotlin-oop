package app

import java.util.*

class Student(val name: String, private val age: Int, val id: String)

//fun Student.sayGoodbye(name: String) {
//    println("Goodbye ${name} my age is ${this.age}") // age dont access because  private properties class
//}

fun Student?.sayHello(name: String){ // if nullable
    if(this !== null) {
        println("Hello ${name} my name is ${this.name}")
    }
}

val Student?.upperName: String
    get() = this?.name?.uppercase(Locale.getDefault()).toString()

fun main() {
    val student = Student("Aji", 21, "3A")
    student.sayHello("joko")
    println(student.upperName)
}