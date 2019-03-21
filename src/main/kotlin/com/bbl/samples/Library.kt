package com.bbl.samples

class Library(val books: List<Book>) {
    fun findBookByISBN(isbn: String): Book? {
      return books.filter { b -> b.isbn == isbn }.firstOrNull()
    }

}
