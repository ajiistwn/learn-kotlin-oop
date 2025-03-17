package data

import java.util.*

class Note (title: String){
    var title: String = title
        get() = field
        set(value){
            if (value.isNotBlank()){
                field = value
            }
        }
}

class BigNote(val title: String){
    var bigTitle: String = ""
        get() = title.uppercase(Locale.getDefault())

}