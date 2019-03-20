package com.bbl.samples

data class Book(val name: String, val isbn: String, val publishYear: Int) {
    fun computeState(): String {
        return if (publishYear >= 2018) "new" else "old"
    }

    fun rate(note: Int): String {
        return when (note) {
            0 -> ""
            1 -> "★"
            2 -> "★★"
            3 -> "★★★"
            4 -> "★★★★"
            5 -> "★★★★★"
            else -> "Invalid note"
        }
    }

    fun findBookSubject(): String {

        return when {
            name.contains("programming", true) -> "Software development"
            name.contains("miroservices", true) -> "Software architecture"
            else -> "Unknown book"
        }
    }

}
