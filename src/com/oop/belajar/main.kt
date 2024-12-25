package com.oop.belajar

import com.oop.belajar.person.*

fun main() {
//    val mamat = Person("Rizky", "Rahmat Nugraha")
//    val yoss = Person("Yoss", "Ananto")

//    println(mamat.sayHello("Yoss"))
//    println(yoss.sayHello("Mamat"))

    val mamatAdress = Address("Rizky Rahmat")

    println(mamatAdress.sayHello("Yoss"))
    println(mamatAdress.alamat("Cianjur"))
}