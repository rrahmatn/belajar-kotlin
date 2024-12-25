package com.oop.belajar.animal


class Ability(name: String, private val runs: Int, val damage: Int) : Animal(name) {

    override fun run() {
        println("I was running at ${this.runs} miles an hour")
    }

    fun attack(number: Int = 1): Int {
       return when{
            number > 1->{
                println("${super.name} : I had attacking critical`s on you in ${this.damage * number} damages")
                 this.damage * number
            }
            else -> {
                println("${super.name} : I had attacking on you in ${this.damage} damages")
                 this.damage
            }
        }
    }

    fun attacked(damage: Int) {

        super.hp -= damage
        val life = 1..100
        return when (super.hp) {
            in life -> {
                println("${this.name}  : Aww! its hurt!")
                println("${this.name} : My Hp now is ${super.hp}")
            }

            else -> println("${this.name} : I was died!")
        }
    }
}