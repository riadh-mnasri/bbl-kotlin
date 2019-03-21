package com.bbl.samples

fun main(){
    val kotlinBook = Book("Programming Kotlin", "ISBNTEST1", 30)
    val library = Library(listOf(kotlinBook))
    val foundBook = library.findBookByISBN("TOTO")
    println("My favorite book is : ${foundBook!!.name}")

}

