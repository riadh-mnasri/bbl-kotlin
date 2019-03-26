package com.bbl.samples

data class Library(val books: List<Book>) {
    fun findBookByIsbn(isbn: String): BookResult {
        val result = books.firstOrNull{ b -> b.isbn == isbn }
         if (result == null) return BookResult.BookNotFound(isbn) else return BookResult.BookFound(result)
    }


    fun availability(bookResult: BookResult): String {
        return when (bookResult) {
            is BookResult.BookNotFound -> ":-("
            is BookResult.BookFound -> "Cool ! "
        }
    }
}