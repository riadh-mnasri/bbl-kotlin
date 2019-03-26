package com.bbl.samples

data class Book(val isbn: String, val name: String, val price: Int = -1) {
    fun priceState() = if (price < 40) "Good to buy" else "Expensive"

    infix fun focusedPricePlus(bookToAdd: Book): Book {
        return copy(isbn = bookToAdd.isbn + " & " + isbn,
                name = bookToAdd.name + " & "+ name,
                price = bookToAdd.price + price)
    }
}
