package com.bbl.samples

fun main() {
    val kotlinBook = Book("ISBNTEST1", "Programming Kotlin", 35)
    val dddBook = Book("ISBNTEST2", "Domain Driven Design", 50)
    println("kotlinBook :: $kotlinBook")
    val libray = Library(listOf(kotlinBook))
    val bookResult = libray.findBookByIsbn("ISBNTEST1")
    val displayAvailability = libray.availability(bookResult)
    val booksSum = kotlinBook focusedPricePlus dddBook
    println("Book search eval :: ${booksSum}")
}