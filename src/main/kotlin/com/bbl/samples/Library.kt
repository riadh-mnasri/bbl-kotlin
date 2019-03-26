package com.bbl.samples

data class Library(val books: List<Book>) {
    fun findBookByIsbn(isbn: String): BookResult {
       val result = books.firstOrNull { it.isbn == isbn }
       return  if (result == null) BookResult.BookNotFound(isbn)
       else BookResult.BookFound(result)
    }
}