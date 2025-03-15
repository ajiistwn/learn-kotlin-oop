package app

import data.Shape
import data.Rectangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)
    println(rectangle.parentCorner)
}