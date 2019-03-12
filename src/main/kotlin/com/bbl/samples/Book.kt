package com.bbl.samples

data class Book(val name: String, val isbn: String) {
    fun rate(note: Int): String {
         return when(note){
            0 -> ""
            1 -> "★"
            2 -> "★★"
            3 -> "★★★"
            4 -> "★★★★"
            5 -> "★★★★★"
            else -> "Not a correct rate"
        }
    }
}
