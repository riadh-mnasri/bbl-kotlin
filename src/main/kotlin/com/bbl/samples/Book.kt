package com.bbl.samples

import kotlin.random.Random

data class Book(val isbn: String, val name: String, val price: Int=-1){
    val isAvailable : Boolean
    get() = Random.nextBoolean()

    fun priceState(): String {
        return if (price > 40) "Expensive" else if (price < 40) "Good to Buy" else "Bad price"
    }


     infix fun addedTo(bookToAdd: Book): Book{
        return Book(bookToAdd.isbn + isbn, bookToAdd.name + "&"+ name, bookToAdd.price + price)
    }
}