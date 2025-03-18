package app

import data.Student

fun main() {
    val student = Student("Aji", 21,"1A")
    student.let {
        println(it.name)
        println(it.id)
    }

    student.run {
        println(this.name)
        println(this.upperName)
    }

    val student3: app.Student = student.apply {
        "name ${this.name} id ${this.id}"
    }

    println(student3)

    val olsoResult = student.let {
        println(it.name)
        println(it.id)
    }
    println(olsoResult)

    val withResult = student.let {
        println(it.name)
        println(it.id)
    }
    println(withResult)
}