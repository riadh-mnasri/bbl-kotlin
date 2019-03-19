package com.bbl.samples

sealed class BookResult(val description: String) {

    class BookNotFound(val bookName: String): BookResult("Sorry ! Book not found :-(")

    class BookAvailable(val book: Book): BookResult("Cool ! You have the book :-) ")

}
