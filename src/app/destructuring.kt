package app

import data.Game
import data.Login
import data.MinMax

fun minmax(value1: Int, value2: Int): MinMax{
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }

}

fun login (login: Login, callBack: (Login) -> Boolean): Boolean {
    return callBack(login)
}
fun main() {

    val game = Game("Dota", 200000)
    val (name, price) = game
    println("$name $price")

    val (min, max) = minmax(10, 100)

    val login = Login("aji", "password")
    login(login){
        login.username == "aji" && login.password == "password"
    }

    login(login) {(username, password) ->
        username == "aji" && password == "password"
    }


}



