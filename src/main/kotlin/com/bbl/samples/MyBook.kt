package com.bbl.samples

import kotlin.random.Random

data class MyBook(val isbn: String, val name: String, val price: Int=-1){
    val isAvailable: Boolean
    get() {
        return Random.nextBoolean()
    }

    fun priceState(): String{
        return if(price > 40) {"Expensive"} else "Good to buy"
    }
}
