package com.bbl.samples

sealed class BookResult {
    class BookFound(val book: MyBook): BookResult()
    class BookNotFound(val isbn: String): BookResult()

}
