package com.oop.belajar.animal

interface Attribute {
    var hp : Int
    val names : String
}
interface Animals : Attribute{
    fun run() : Unit
}

abstract  class Animal( val name : String) : Animals {
    init {
        println("New Animal has been created! with name $name")
    }
    override val names = name
    override var hp : Int = 100
    abstract override fun run() : Unit
}