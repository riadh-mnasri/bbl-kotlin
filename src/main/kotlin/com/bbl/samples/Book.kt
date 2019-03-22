package com.bbl.samples

data class Book(val isbn: String, val name: String, val price: Int = -1) {
    fun isExpensive(): String {
        return if (price > 40) "Expensive" else "Good to buy"
    }

    fun isBookAvailable(bookResult: BookResult): Boolean {
        return when (bookResult) {
            is BookResult.BookFound -> true
            is BookResult.BookNotFound -> false
        }
    }

    operator fun plus(bookToAdd: Book):Book{
        return Book(isbn + bookToAdd.isbn, name + "&"+ bookToAdd.name, price+bookToAdd.price)
    }
}
