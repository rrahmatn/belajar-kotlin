package com.oop.belajar.animal

abstract  class Animal( val name : String) {
    init {
        println("New Animal has been created! with name $name")
    }
    open var hp = 100
    abstract  fun run() : Unit
}