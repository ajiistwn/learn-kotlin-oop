package app

import data.Manager
import data.vicePresident

fun main() {
    val manager = Manager("Aji")
    manager.sayHello("Eko")
    val VP = vicePresident("Kurnia")
    VP.sayHello("Ibnu")
}
