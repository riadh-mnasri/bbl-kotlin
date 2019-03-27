package com.bbl.samples

data class Library(val books: List<MyBook>) {
    fun findBookByIsbn(isbn: String): BookResult {
      val result =  books.firstOrNull{ b -> b.isbn == isbn}
        return when(result){
            null -> BookResult.BookNotFound(isbn)
            else -> BookResult.BookFound(result)
        }
    }

    fun availability(bookResult: BookResult): String{
        return when(bookResult){
            is BookResult.BookNotFound -> "May next time :("
            is BookResult.BookFound -> "Cool :)"
        }
    }
}