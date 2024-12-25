infix fun String.slug(type : String) : String {
    return when(type){
        "UP" ->  this.uppercase().replace(" " , "-")
        "DOWN" -> this.lowercase().replace(" " , "-")
        else -> "Masukan parameter yang valid antara UP dan DOWN"
    }
}

fun main() {
    val title = "Andromeda Technology"
    println(title slug "DOWN" )
}