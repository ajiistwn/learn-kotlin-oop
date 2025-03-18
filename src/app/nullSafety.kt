package app


data class Friend(val name: String)

fun sayHello(friend: Friend?){
    if (friend !== null) {
        println("Hello ${friend.name}")
    }
}
fun main() {

    sayHello(Friend("Aji"))
    sayHello(null)

}