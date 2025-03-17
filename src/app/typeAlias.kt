package app

typealias Pelajar = Student
typealias Murid = Pelajar


typealias StringSupplier = () -> String

fun sayyHello(supplier: StringSupplier){
    println("supplier ${supplier()}")
}

fun main() {
    val pelajar = Pelajar("Nando", 21, "2A")
    println(pelajar.upperName)

    val murid1 = Murid("Joko", 21, "31")
    println(murid1.upperName)

    sayyHello { "Nano" }
}