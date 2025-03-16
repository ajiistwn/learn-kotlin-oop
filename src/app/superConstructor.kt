package app

import data.Customer
import data.PremiumCostomer
import data.ExecutiveCustomer

fun main() {
    val premiumCostomer = PremiumCostomer("Aji")
    println(premiumCostomer.name + premiumCostomer.type + premiumCostomer.balance)

    val executiveCustomer = ExecutiveCustomer("Kurnia", 0)
    println(executiveCustomer.name + executiveCustomer.type + premiumCostomer.balance)
}