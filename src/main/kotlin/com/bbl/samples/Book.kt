package com.bbl.samples

import kotlin.random.Random

data class Book(val isbn: String, val name: String, val price: Int = -1){
    val isAvailable : Boolean
    get() = Random.nextBoolean()

    fun priceState() = if(price>40) "Expensive" else "Good to buy"

    infix fun focusedPricePlus(booktoAdd: Book): Book{
        return copy(name = booktoAdd.name + " & "+  name, price = booktoAdd.price+price)
        //return Book(booktoAdd.isbn + " & " + isbn, booktoAdd.name + " & "+  name, booktoAdd.price+price)
    }
}
