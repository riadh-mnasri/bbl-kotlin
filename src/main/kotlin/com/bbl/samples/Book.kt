package com.bbl.samples

import kotlin.random.Random

data class Book(val isbn: String, val name: String) {
    var isBookAvailable: Boolean
    get() = Random.nextBoolean()
    set(value){
        isBookAvailable = value
    }
}
