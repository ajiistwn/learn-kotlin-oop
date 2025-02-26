package app

import data.User
fun main() {
    var user1 = User("Aji")
    println("${user1.userName} ${user1.password}")
    user1.sayHello()
}