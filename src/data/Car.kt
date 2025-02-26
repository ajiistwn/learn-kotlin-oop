package data

class Car (brand: String, year: Int = 2020 ){
    var brand: String = brand
    var year: Int = year

    init {
        println("Car ${this.brand} made")
    }
}