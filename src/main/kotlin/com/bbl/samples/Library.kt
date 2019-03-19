package com.bbl.samples

class Library(private val books: List<Book>) {
    fun findBookByIsbn(isbn: String): Book? {
         return books.asSequence().filter { b -> b.isbn == isbn }.firstOrNull()
    }
}
