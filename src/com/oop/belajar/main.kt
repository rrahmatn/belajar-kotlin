package com.oop.belajar

import com.oop.belajar.person.*
import com.oop.belajar.animal.*

fun main() {
//    belajarPerson()
    belajarAnimal()
}

fun belajarAnimal(){
    val kucing = Ability("Kucing" , 35 , 31)
    val anjing = Ability("Anjing" , 26 , 45)

    anjing.attacked(kucing.attack())
    anjing.attacked(kucing.attack(2))
    anjing.attacked(kucing.attack())
    anjing.attacked(kucing.attack())
}


fun belajarPerson(){
    val mamat = Person("Rizky", "Rahmat Nugraha")
    val yoss = Person("Yoss", "Ananto")

    println(mamat.sayHello("Yoss"))
    println(yoss.sayHello("Mamat"))

    val mamatAddress = Address("Rizky Rahmat")

    println(mamatAddress.sayHello("Yoss"))
    println(mamatAddress.alamat("Cianjur"))
}