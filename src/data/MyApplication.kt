package data

import data.Fancy
@Fancy(author = "Aji")
class MyApplication(val name: String, val version: Int) {

    fun info (): String = "Aplication $name-$version"
}