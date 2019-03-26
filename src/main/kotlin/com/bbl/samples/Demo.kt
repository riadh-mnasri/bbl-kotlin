package com.bbl.samples

fun main() {
    val kotlinBook = Book("ISBNTEST1", "Programming Kotlin", 35)
    val dddBook = Book("ISBNTEST2", "Domain Driven Design", 50)
    println("My book::  $kotlinBook")
    val library = Library(listOf(kotlinBook, dddBook))
    val bookResult = library.findBookByIsbn("ISBNTEST1")
    //?: dddBook
    //println("foundBook ==> ${foundBook!!.name}")
    //println("My book availability :: ${foundBook?.priceState()}")
    val availability = library.availability(bookResult)
    //println("Is my favourite book available :: $availability")
    //println(" My book rate :: "+ kotlinBook.rate(5))
    val myBooks = kotlinBook customPlus dddBook
    println("myBooks :: $myBooks")


}
