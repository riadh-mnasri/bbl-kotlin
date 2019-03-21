package com.bbl.samples

class Libray(val books: List<Book>) {
    fun findBookByIsbn(isbn: String): Book? {
      return books.firstOrNull{ it.isbn == isbn}
    }

}
