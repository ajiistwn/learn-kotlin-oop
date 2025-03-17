package data

open class Teacher { //class Teacher is public
    val name: String = "Aji"
    protected val age: Int = 21
    val id: String = "1A"
//        get() = "private id: ${field}" // if you need access
    internal fun teach(){
        println("Teach ${this.name}")
    }
}

class MathTeach: Teacher() {
    val ageSuper = super.age
//    val idSuper = super.id //private dont acces in child

}