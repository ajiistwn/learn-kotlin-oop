package app

import data.MyBaseDelegate
import data.MyBase

fun main() {
    val base = MyBase()
    base.sayyHello("Aji")
    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayyHello("Joko")

}
