package com.bbl.samples

import kotlin.random.Random

data class Book(val isbn: String, val name: String, val price: Int=-1){
    val isAvailable : Boolean
    get() = Random.nextBoolean()

    fun priceState(): String{
        return when {
            price < 40 -> "Good To buy"
            price > 40 -> "Expensive"
            else -> "Invalid Price"
        }
    }

    infix fun addedTo(bookToAdd : Book): Book {
        return copy(isbn = bookToAdd.isbn + " & " + isbn, name = bookToAdd.name + " & " + name, price = bookToAdd.price + price)
    }
}
