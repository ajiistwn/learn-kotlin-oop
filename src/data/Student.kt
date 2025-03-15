package data

class Student(val name: String = "aji") {

    fun sayyHello(firstName: String, lastName: String){
        println("${firstName} ${lastName}")
    }

    fun sayyHello(firstName: String = ""){
        println("${firstName}")
    }

    fun sayHello2(){
        println("Hello ${this.name}")
    }
}