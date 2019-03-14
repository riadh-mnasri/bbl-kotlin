package com.bbl.samples

import org.assertj.core.api.Assertions
import org.junit.Test

class LibraryTest {

    @Test
    fun should_find_kotlin_book() {
        // Given
        // How to instantiate classes
        // val keyword
        // No semicolon
        val kotlinBook = Book("Programming Kotlin", "isbntest1")
        val library = Library(listOf(kotlinBook))

        // When
        val foundBook = library.findBookByIsbn(kotlinBook.isbn)

        // Then
        Assertions.assertThat(foundBook).contains(kotlinBook)

    }

    @Test
    fun should_rate_5_stars_for_programming_kotlin_book() {
        // Given
        val kotlinBook = Book("Programming Kotlin", "isbntest1")

        // When
        val kotlinBookRate = kotlinBook.rate(5)

        // Then
        Assertions.assertThat(kotlinBookRate).isEqualTo("★★★★★")
    }

    @Test
    fun should_be_able_to_check_book_publish_year() {
        // Given
        val kotlinBook = Book("Programming Kotlin", "isbntest1", 2018)

        // When
        // Expression vs instructions
        val newOrOldBook = if(kotlinBook.year > 2017) "new" else "old"

        // Then
        Assertions.assertThat(newOrOldBook).isEqualTo("new")
    }

    @Test
    fun should_be_able_to_classify_my_books() {
        // Given
        // Pattern matching without argument
        val kotlinBook = Book("Programming Kotlin", "isbntest1", 2018)

        // When
        val bookSubject = kotlinBook.findBookSubject()

        // Then
        Assertions.assertThat(bookSubject).isEqualTo("Software engineering")

    }
}