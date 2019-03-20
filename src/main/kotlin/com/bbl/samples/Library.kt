package com.bbl.samples

class Library(private val books: List<Book>) {
    fun findBookByName(bookName: String): BookResult {
        val result = books.firstOrNull() { it.name == bookName }
        if(result != null){
            return BookResult.BookFound(result)
        }
        return BookResult.BookNotFound(bookName)
    }

    fun findBookByIsbn(bookIsbn: String): Book? {
        return books.firstOrNull() { it.isbn == bookIsbn }
    }

    fun isBookAvailable(bookResult: BookResult): Boolean {
        return when(bookResult){
            is BookResult.BookNotFound -> false
            is BookResult.BookFound -> true
        }
    }

}
