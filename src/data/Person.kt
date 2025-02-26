package data

class Person (firsName: String = "aji",middleName: String = "",lastName: String = "Setiawan"){
    var firstName: String = firsName
    var middleName: String = middleName
    var lastName: String = lastName

    constructor(firsName: String, lastName: String )
    : this(firsName, "", lastName){

    }

    constructor(firsName: String) : this(firsName, ""){

    }

}

