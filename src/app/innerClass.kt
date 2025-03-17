package app

import data.Boss

fun main() {
    val boss = Boss("Aji")
    val employee = boss.Employee("Joko")
    employee.hi()
}