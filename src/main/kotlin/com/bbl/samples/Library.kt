package com.bbl.samples

class Library(private val books: List<Book>) {
    fun findBookByIsbn(isbn: String): List<Book> {
         return books.filter { b -> b.isbn == isbn }
    }

}
