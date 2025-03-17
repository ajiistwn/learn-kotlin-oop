package app

import data.Gender
fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val all: Array<Gender> = Gender.values()

    println(man)
    println(man.printDescription())

    println(woman)
    println(woman.printDescription())
    println(all)

    val manOfString = Gender.valueOf("MALE")
    val womanOfString = Gender.valueOf("FEMALE")
    println(manOfString)
    println(womanOfString)

}