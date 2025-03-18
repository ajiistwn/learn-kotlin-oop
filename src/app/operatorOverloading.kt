package app

import data.Fruit

fun main() {

    val fruit1 = Fruit(100)
    val fruit2 = Fruit(200)
    val fruit = fruit1 + fruit2
    println(fruit.total)

}