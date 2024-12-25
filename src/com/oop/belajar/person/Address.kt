package com.oop.belajar.person

class Address(name: String) : Person(name.split(" ")[0], name.split(" ")[1]) {
    val alamat = fun(value: String): String { return "Halo aku $name rumah ku di $value" }
}