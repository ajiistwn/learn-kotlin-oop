package data

open class Employee(val name: String) {
    fun sayHello(name: String){
        println("Hello ${name} my name is ${this.name}")
    }

    open fun hello(){
        println("Hello ${this.name} !")
    }
}

class Manager (name: String): Employee(name){
//    fun sayHello(name: String){ // override failed
//        println("Hi ${name} im manager")
//    }
    override fun hello() {
        println("my name is ${this.name}")
    } // use key opet in class parrent
}

//class VicePresident(name: String): Manager(name) //error because parent class not key (open)

class vicePresident(name: String): Employee(name)