package com.bbl.samples

import kotlin.random.Random

class BookV2(name: String, isbn: String) {
 var isAvailable: Boolean
    get() = Random.nextBoolean()
    set(value){
        isAvailable = value
    }
}
