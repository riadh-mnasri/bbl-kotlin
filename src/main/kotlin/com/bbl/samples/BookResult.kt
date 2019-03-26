package com.bbl.samples

sealed class BookResult {
   class BookFound(val book: Book): BookResult()
   class BookNotFound(val isbn: String): BookResult()
}
