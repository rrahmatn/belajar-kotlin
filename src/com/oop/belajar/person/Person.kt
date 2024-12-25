package com.oop.belajar.person

open class Person(private val  firstName : String, private val lastName : String) {
    init {
        println("Person baru berhasil dibuat atas nama : $firstName $lastName")
    }
    val sayHello = fun(value : String) : String { return "Hello Aku $firstName $lastName, Senang bertemu denganmu $value"}
    private val first  = firstName
    private  val last  = lastName

    val getName = "$first $last"
    val reverseName = "$last $first"
}