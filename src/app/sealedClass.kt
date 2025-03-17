package app

import data.Plus
import data.Minus
import data.Operation

fun opration(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    val plus = Plus()
    val minus = Minus()

    println(opration(2, 2 , plus))
    println(opration(3, 1, minus))
}