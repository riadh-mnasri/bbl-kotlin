package com.bbl.samples


fun main(){
    val kotlinBook = Book("Programming Kotlin", "ISBNTEST1", 30)
    val libray = Library(listOf(kotlinBook))
    val result = libray.findBookByIsbn("ISBNTEST1")
    val isAvailable = libray.isMyFavoriteBookAvailable(result)

    val ScalaBook = Book("Programming Scala", "ISBNTEST2",  40)
    val resultBook = kotlinBook + ScalaBook
    println("MyFavorite Books total price ${resultBook.price}")

}

