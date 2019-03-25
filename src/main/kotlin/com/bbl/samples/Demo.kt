package com.bbl.samples

fun main() {
    val kotlinBook = Book("ISBNTEST1", "Programming Kotlin", 35)
    val dddBook = Book("ISBNTEST2", "Domain Driven Design", 40)
    val scalaBook = Book("ISBNTEST3", "Programming Scala", 45)
    println("my book : $kotlinBook")
    val library = Library(listOf(kotlinBook))
    val foundBook : BookResult = library.findBookByIsbn("ISBNTEST1")
    println(when(foundBook){
        is BookResult.BookFound -> "Cool"
        is BookResult.BookNotFound -> ":-("
    })
    //println("foundbOok :: ${foundBook!!.name}")
    //println("My Book is ${foundBook.name}")
    //println("My book rate :: ${kotlinBook.rate(5)} ")
    val myBooks = kotlinBook addedTo scalaBook
    println("My Book list :: $myBooks")

}