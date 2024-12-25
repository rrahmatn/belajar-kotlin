fun main() {
    val sayHello: (String , Int) -> String = { name: String , jumlah : Int -> "Hallo $name berjumlah $jumlah" }
    println(sayHello("mamat" , 5))
}