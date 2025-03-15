package app

import data.Employee
import data.Manager

fun main() {

    val employee = Employee("nanda")
    employee.hello()

    val manager = Manager("Andi")
    manager.hello()
}