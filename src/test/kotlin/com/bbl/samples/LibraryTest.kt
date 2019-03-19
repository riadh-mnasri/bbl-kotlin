package com.bbl.samples

import org.assertj.core.api.Assertions
import org.assertj.core.api.SoftAssertions
import org.junit.Test

class LibraryTest {

    @Test
    fun should_find_kotlin_book() {
        // Given
        // How to instantiate classes
        // val vs var, data classes
        // No semicolon
        val kotlinBook = Book("Programming Kotlin", "isbntest1")
        val library = Library(listOf(kotlinBook))

        // When
        val foundBook = library.findBookByIsbn(kotlinBook.isbn)

        // Then
        Assertions.assertThat(foundBook).isEqualTo(kotlinBook)

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

    @Test
    fun should_not_retrieve_a_book_when_isbn_is_not_correct() {
        // Given
        //var isbn = null
        val isbn = "test"
        val kotlinBook = Book("Programming Kotlin", "isbntest1", 2018)

        // When
        // Null Safety
        //val book = Library().findBookByIsbn(null)
        val book = Library(listOf(kotlinBook)).findBookByIsbn(isbn)

        // Then
        // Safe call
        Assertions.assertThat(book?.name).isNull()

    }

    @Test
    fun shoud_make_a_safe_call_to_books_list_with_nulls() {
        // Given
        val kotlinBook = Book("Programming Kotlin", "isbntest1", 2018)
        val booksListWhenNulls : List<Book?> = listOf(kotlinBook, null)

        // Then
        val softAssertions = SoftAssertions()
        for(book in booksListWhenNulls){
            book?.let {
                softAssertions.assertThat(book.name).isNotNull
            }
        }
        softAssertions.assertAll()
    }

    @Test
    fun should_make_call_safe_call_with_elvis_operator() {
        // Given
        val isbn = "GTFFFGT"
        val books = listOf(Book("Programming Kotlin", "isbntest1", 2018))

        // When
        val foundBook = Library(books).findBookByIsbn(isbn)?: Book("Design Patterns", "ggfg", 2000)

        // Then
        Assertions.assertThat(foundBook.name).isEqualTo("Design Patterns")

    }
}