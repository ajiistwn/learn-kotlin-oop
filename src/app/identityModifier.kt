package app

import data.Teacher
import data.MathTeach

fun main() {
    val teach = Teacher()
    println(teach.name)
//    println(teach.age) //age properties is protected
//    println(teach.id // teach is private
    println(teach.id)

    val mathTeach = MathTeach()
    println(mathTeach.ageSuper)

}