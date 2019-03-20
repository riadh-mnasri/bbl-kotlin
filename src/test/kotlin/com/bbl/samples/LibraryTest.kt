package com.bbl.samples

import org.assertj.core.api.Assertions
import org.assertj.core.api.SoftAssertions
import org.junit.Test

class LibraryTest {

    @Test
    fun should_find_kotlin_book() {
        // How to instantiate classes
        // val vs var, data classes
        // No semicolon
        // Given
        val book = Book("Programming Kotlin", "isbntest1", 2018)

        val library = Library(listOf(book))


        // When
        val foundBook = library.findBookByIsbn("isbntest1")

        // Then
        if (foundBook != null) {
            Assertions.assertThat(foundBook.name).isEqualTo("Programming Kotlin")
        }

    }

    @Test
    fun should_access_book_availability() {
        // Properties
        // Given
        val book = BookV2("Programming Kotlin", "isbntest1")

        // Then
        Assertions.assertThat(book.isAvailable).isTrue()
    }

    @Test
    fun should_be_able_to_check_book_publish_year() {
        // Expression vs instructions
        // Given
        val book = Book("Programming Kotlin", "isbntest1", 2018)

        // When
        val bookState = book.computeState()

        // Then
        Assertions.assertThat(bookState).isEqualTo("new")

    }

    @Test
    fun should_rate_5_stars_for_programming_kotlin_book() {
        // Pattern matching with parameter
        // Given
        val book = Book("Programming Kotlin", "isbntest1", 2018)

        // When
        val processedRate = book.rate(5)

        // Then
        Assertions.assertThat(processedRate).isEqualTo("★★★★★")
    }

    @Test
    fun should_be_able_to_classify_my_books() {
        // Pattern matching without argument
        // Given
        val book = Book("Programming Kotlin", "isbntest1", 2018)

        // When
        val bookSubject = book.findBookSubject()

        // Then
        Assertions.assertThat(bookSubject).isEqualTo("Software development")


    }

    @Test
    fun should_not_retrieve_a_book_when_isbn_is_not_correct() {
        // Null Safety: ? operator
        // Given
        val book = Book("Programming Kotlin", "isbntest1", 2018)
        val library = Library(listOf(book))

        // When
        val foundBook = library.findBookByIsbn("toto")

        // Then
        Assertions.assertThat(foundBook?.name).isNull()


    }

    @Test
    fun should_make_a_safe_call_to_books_list_with_nulls() {
        // Null Safety : list with null
        // Let keyword
        // Given
        val book = Book("Programming Kotlin", "isbntest1", 2018)
        val booksListWithNulls = listOf(book, null)

        // Then
        val softAssertions = SoftAssertions()
        for(book in booksListWithNulls){
            book?.let {
                softAssertions.assertThat(it.name)
            }
        }
        softAssertions.assertAll()

    }

    @Test
    fun should_make_safe_call_with_elvis_operator() {
        // Null Safety : elvis operator
        // Given
        val book = Book("Programming Kotlin", "isbntest1", 2018)

        // When
        val library = Library(listOf(book))
        val foundBook = library.findBookByIsbn("TOTO") ?: Book("Domain Driven Design", "isbntest2", 2003)

       // Then
        Assertions.assertThat(foundBook.name).isEqualTo("Domain Driven Design")


    }

    @Test
    fun should_receive_not_found_book_when_it_is_absent_from_library() {
        // Sealed classes/pattern matching
        // Given
        val kotlinBook = Book("Programming Kotlin", "isbntest1", 2018)
        val library = Library(listOf(kotlinBook))

        // When
        val result = library.findBookByName("TOTO")

        // Then
        Assertions.assertThat(library.isBookAvailable(result)).isFalse()


    }

    @Test
    fun should_be_able_to_add_behaviour_to_external_dependency() {
        // Extension functions
        // Given
        val kotlinBook = Book("Programming Kotlin", "isbntest1", 2018)

        // Then
        Assertions.assertThat(kotlinBook.isRecent(2018)).isTrue()
        
    }
}