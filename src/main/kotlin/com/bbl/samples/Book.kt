package com.bbl.samples

// Data classes
// Default Values
// Pattern Matching
data class Book(val name: String, val isbn: String, val year: Int = -1) {
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

    fun findBookSubject(): String {
        return when {
            name.contains("programming", true) -> "Software engineering"
            name.contains("microservices", true) -> "Software architecture"
            else -> "Unknown book"
        }

    }
}
