package data

interface Base {
    fun sayyHello(name: String)
}

class MyBase: Base {
    override fun sayyHello(name: String) {
        println("Hello $name")
    }
}

class MyBaseDelegate(val base: Base): Base by base