package com.bbl.samples

sealed class BookResult {
    class BookFound(book: Book): BookResult()
    class BookNotFound(isbn: String): BookResult()
}
