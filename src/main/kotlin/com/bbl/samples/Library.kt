package com.bbl.samples

class Library(val books: List<Book>) {
    fun findBookByIsbn(isbn: String): BookResult {
        val foundBook = books.firstOrNull { it.isbn == isbn }
        return when {
            foundBook != null -> return BookResult.BookFound(foundBook)
            else -> return BookResult.BookNotFound(isbn)
        }
    }

}
