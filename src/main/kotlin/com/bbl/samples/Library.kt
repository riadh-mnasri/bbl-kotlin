package com.bbl.samples

class Library(val books: List<Book>) {
    fun findBookByIsbn(isbn: String): BookResult {
            val result = books.firstOrNull { it.isbn == isbn }
            return if(result == null) BookResult.BookNotFound(isbn) else BookResult.BookFound(result)
    }

    fun isMyFavoriteBookAvailable(result: BookResult) {
        when (result) {
            is BookResult.BookFound -> println("Cool :-)")
            //is BookResult.BookNotFound -> println("So sorry :-(")
        }
    }

}
