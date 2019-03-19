package com.bbl.samples

class Library(private val books: List<Book>) {
    fun findBookByIsbn(isbn: String): Book? {
        return books.asSequence().filter { b -> b.isbn == isbn }.firstOrNull()
    }

    fun findBookByName(bookName: String): BookResult {
        val result = books.filter { b -> b.name == bookName }
        if (result.isEmpty()) return BookResult.BookNotFound(bookName)
        return BookResult.BookAvailable(result.first())
    }

    fun isBookAvailable(bookResult: BookResult): Boolean {
        return when (bookResult) {
            is BookResult.BookNotFound -> false
            is BookResult.BookAvailable -> true
        }
    }

}
