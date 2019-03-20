package com.bbl.samples

sealed class BookResult {
    class BookNotFound(val isbn: String): BookResult()
    data class BookFound(val book: Book): BookResult()
}
