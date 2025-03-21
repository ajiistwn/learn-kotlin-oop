package data

class User(val userName: String = "user",
           val password: String = "password") {

    fun sayHello(){
        println("Hello ${this.userName}")
    }

    override fun toString(): String {
        return "User ${userName}"
    }

}