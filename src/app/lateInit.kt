package app

import data.Television

fun main() {

    val samsung = Television()
//    println(samsung.brand) //error access because null value
    samsung.initTelevision("samsung")
    println(samsung.brand)

}