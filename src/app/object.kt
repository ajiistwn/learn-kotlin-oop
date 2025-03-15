package app

import data.Person
import data.Car
import data.Student

fun main() {
//    val aji = Person()
//    aji.firstName = "Aji"
//    aji.lastName = "Setiawan"
    val aji = Person()
    println("${aji.firstName} ${aji.middleName} ${aji.lastName}.")
    val budi = Person("Budi", "Permana", "Herdianto")
    println("${budi.firstName} ${budi.middleName} ${budi.lastName}.")
    val nanda = Person("Nanda")
    println("${nanda.firstName} ${nanda.middleName} ${nanda.lastName}")

    var avanza = Car("Avanza")
    println("${avanza.brand}, ${avanza.year}")

    var studen1 = Student()
    studen1.sayHello2()
}