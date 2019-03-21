package com.bbl.samples

data class Book(val name: String, val isbn: String, val price: Int = -1){
    fun isExpensive(): String {
        return if(price> 40) "expensive" else "good to buy"
    }

    operator fun plus(book:Book): Book{
        return Book(name + book.name, isbn + book.isbn, price+ book.price)
    }
}
