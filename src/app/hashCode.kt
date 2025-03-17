package app


import data.Company
fun main() {
    val company1 = Company("Aji")
    val company2 = Company("Aji")

    println("${company1.hashCode()} ${company2.hashCode()}")
    println(company1.hashCode() == company2.hashCode())

}