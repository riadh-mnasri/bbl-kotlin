package com.bbl.samples

fun main(){
    // Variable declaration, inference type, instanciation classe
   val bookKotlin = Book("ISBNTEST1", "Programming Kotlin")
   val library = Library(listOf(bookKotlin))
    // Null Safety
   val foundBook = library.findBookByIsbn("ISBNTEST1")
   val isBookAvailable = bookKotlin.isBookAvailable
    println("isBookAvailable :: $isBookAvailable")


}

