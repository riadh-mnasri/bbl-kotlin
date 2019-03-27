package com.bbl.samples

fun main() {
    var kotlinBook = Book("ISBNTEST1", "Programming Kotlin", 35)
    var dddBook = Book("ISBNTEST2", "Domain Driven Design", 50)
    //println("My Book :: $kotlinBook")
    val library = Library(listOf(kotlinBook))
    val result = library.findBookByIsbn("TOTO")
    //println("My favourite book rate :: ${kotlinBook.rate(5)}")
    val sumOfyBooks = kotlinBook addedTo dddBook
    println("sumOfyBooks :: $sumOfyBooks")
}