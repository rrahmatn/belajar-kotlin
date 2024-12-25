package com.oop.belajar.animal

class Ability(name : String, private val runs : Int , val damage : Int) : Animal(name) {

    override fun run() {
        println("I was running at ${this.runs} miles an hour")
    }
    fun attack() : Int{
        println("${super.name} : I had attacking on you in ${this.damage} damages")
        return this.damage
    }

    fun attacked(damage : Int) {
        println("${this.name}  : Aww! its hurt!")
         super.hp -= damage
        println("${this.name} : My Hp now is ${super.hp}")
    }
}