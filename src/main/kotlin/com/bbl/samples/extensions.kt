package com.bbl.samples

fun MyBook.rate(note: Int): String{
    return when(note){
        in 0..5 -> "★".repeat(note)
        else -> "Invalid note"
    }
}