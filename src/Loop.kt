fun main() {


//    FOR LOOP
    val names = arrayOf("Rizky", "Rahmat" , "Nugraaha")
    var total = 0
    for(name in names){
        println(name)
        total++
    }
    println("Total perulangan dilakukan $total kali atau ${names.size} kali")

//    WHILE LOOP
    var i = 0
    while (i < 10){
        println("ini perulanagan ke $i")
        i++
    }
//    DO WHILE LOOP
    doWhileLoop(5  , "*")
}

fun doWhileLoop ( panjang : Int , karakter : String = "c" ){
    var c = 0
    var kar = karakter
    var spasi = " ".repeat(panjang)
    do {
//        if (c % 2 != 0) {
//            c++
//            continue
//        }
        println( spasi +  kar + spasi + "total karakter adalah ${kar.length}, perulangan ke = ${c+1}")
        spasi = spasi.drop(1)
        kar +=  karakter + karakter
        c++


    }while (c < panjang)
}