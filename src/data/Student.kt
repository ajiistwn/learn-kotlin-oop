package data

class Student {

    fun sayyHello(firstName: String, lastName: String){
        println("${firstName} ${lastName}")
    }

    fun sayyHello(firstName: String = ""){
        println("${firstName}")
    }
}