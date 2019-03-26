package com.bbl.samples

data class Library(val books: List<Book>) {
    fun findBookByIsbn(isbn: String): BookResult{
       val result = books.firstOrNull{ it.isbn == isbn}
        return when (result) {
            null -> BookResult.BookNotFound(isbn)
            else -> BookResult.BookFound(result)
        }
    }

    fun BookSearchState(bookResult: BookResult): String {
        return when(bookResult){
            is BookResult.BookFound -> "Cool :-)"
            is BookResult.BookNotFound -> ":-("
        }

    }
}
