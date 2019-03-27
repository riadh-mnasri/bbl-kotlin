package com.bbl.samples

fun main() {
    val kotlinBook = MyBook("ISBNTEST1", "Programming Kotlin")
    println("My Book :: $kotlinBook")
    val library = Library(listOf(kotlinBook))
    println("State :: ${kotlinBook.rate(5)}")
}