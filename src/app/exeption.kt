package app


class ValidationExeption(mesage: String): Throwable(mesage)

fun trowError(message: String){
    if (message.isBlank()){
        throw ValidationExeption("Message is blank")
    }
    println(message)
}

fun main() {
    try {
        trowError("Aji")
        trowError("")
    }catch (error: ValidationExeption){
        println("error ${error.message}")
    }catch (error: Throwable){
        println(error.message)
    }finally {
        println("finish")
    }
}