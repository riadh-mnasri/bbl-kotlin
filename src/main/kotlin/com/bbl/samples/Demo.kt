package com.bbl.samples

fun main() {
    val kotlinBook = Book("IBSNTEST1", "Programming Kotlin", 40)
    val dddBook = Book("IBSNTEST2", "Domain driven design", 50)

    //print("my favourite book :: $kotlinBook")
    val library = Library(listOf(kotlinBook))
    val result = library.findBookByIsbn("TOTO")//.let { it?.name }

    //println("Result :: ${kotlinBook.rate(5)}")
    val sumOfMyBooks =  kotlinBook focusedPricePlus dddBook
    println("Result :: $sumOfMyBooks ")


}