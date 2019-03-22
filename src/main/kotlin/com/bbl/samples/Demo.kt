package com.bbl.samples

fun main(){
    // Variable declaration, inference type, instanciation classe
   val bookKotlin = Book("ISBNTEST1", "Programming Kotlin", 30)
   val bookScala = Book("ISBNTEST2", "Programming Scala", 45)
   val library = Library(listOf(bookKotlin))
    // Null Safety
   // Properties
   //val isBookAvailable = bookKotlin.isBookAvailable
   //println("isBookAvailable :: $isBookAvailable"
    val bookPriceEval = bookKotlin.isExpensive()
    //println("Book price eval :: $bookKotlin.name $bookPriceEval")
   val foundBook = library.findBookByIsbn("ISBNTEST1")
   val bookToRead = library.findBookByIsbn("TOTO") ?: Book("ISBN3","Domain Driver Design")
    //println("found book >> $bookToRead")
    val kotlinBookStarsNumber = bookKotlin.rate(5)
    //println("kotlinBookStarsNumber >> $kotlinBookStarsNumber")
    val booksList = bookKotlin+bookScala
    println("My Books list ::  $booksList")
    
}

