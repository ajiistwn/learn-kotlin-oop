package app

import data.Handphone
import data.Laptop

//fun printObject(any: Any){
//    if (any is Laptop){
//        println("Laptop ${any.name}")
//    } else if (any is Handphone){
//        println("Handphone ${any.name}")
//    } else {
//        println(any)
//    }
//}

fun printObject(any: Any){
    when (any) {
        is Laptop -> {
            println("Laptop ${any.name}")
        }

        is Handphone -> {
            println("Handphone ${any.name}")
        }

        else -> {
            println(any)
        }
    }
}

fun printString(any: Any){
    val value: String? = any as? String // casts nullable
    println(value)
}

fun main() {
    printObject("Aji")
    printObject(2)
    printObject(Laptop("lenovo"))
    printObject(true)
    printObject(Handphone("Samsung"))

    printString(2) //null
    printString("Oke")
}