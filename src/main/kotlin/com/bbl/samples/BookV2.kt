package com.bbl.samples

import kotlin.random.Random

class BookV2(val name: String, val isbn: String) {
    var isAvailable: Boolean
    get() = Random.nextBoolean()
    set(value){
        isAvailable=value
    }
}