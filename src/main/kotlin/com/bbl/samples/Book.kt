package com.bbl.samples

import kotlin.random.Random

data class Book(val isbn: String, val name: String, val price: Int=-1) {
    fun isExpensive(): String {
        return if(price > 40) "Expensive" else "Good to buy"
    }

    var isBookAvailable: Boolean
    get() = Random.nextBoolean()
    set(value){
        isBookAvailable = value
    }
}
