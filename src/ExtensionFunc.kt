fun String.hello() : String = "Hello $this"
fun Int.sum() : Unit = println(this + this)

fun main() {
    val name = "Mamat"
    val hello = name.hello()
    println(hello)
    val number = 325
    number.sum()
    123.sum()
}