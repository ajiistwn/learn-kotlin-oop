package app

import data.BigNote
import data.Note

fun main() {

    val note = Note("Kian Santang")
    println(note.title)
    note.title = "Siliwangi"
    println(note.title)

    val bignote = BigNote("Mahesa Kurung")
    println(bignote.bigTitle)
    println(bignote.title)
}