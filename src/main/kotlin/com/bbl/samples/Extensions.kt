package com.bbl.samples

fun Book.isRecent(referenceYear: Int): Boolean {
    return this.year > referenceYear
}