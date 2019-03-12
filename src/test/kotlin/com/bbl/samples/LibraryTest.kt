package com.bbl.samples

import org.assertj.core.api.Assertions
import org.junit.Test

class LibraryTest {

    @Test
    fun should_find_kotlin_book() {
        // Given
        val kotlinBook = Book("Programming Kotlin", "isbntest1")
        val library = Library(listOf(kotlinBook))

        // When
        val foundBook = library.findBookByIsbn(kotlinBook.isbn)

        // Then
        Assertions.assertThat(foundBook).contains(kotlinBook)

    }
}