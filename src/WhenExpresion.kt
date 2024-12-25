fun main() {
    var score   = 'Z'
    var passValue : Array<Char> = arrayOf('A' ,'B' , 'C')

    when (score) {
        is String -> println("Data tidak valid")
        in passValue -> println("Selamat Anda Lulus!")
        else -> println("Silahkan coba lagi tahun depan")
    }
}