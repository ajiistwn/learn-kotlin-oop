package data

enum class Gender(val description: String) {
    MALE("man"),
    FEMALE("woman");

    fun printDescription(){
        println(description)
    }


}