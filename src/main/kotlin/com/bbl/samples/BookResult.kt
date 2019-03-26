package com.bbl.samples

sealed class BookResult {
          class BookNotFound(val isbn: String): BookResult()
          class BookFound(val book: Book): BookResult()
}
