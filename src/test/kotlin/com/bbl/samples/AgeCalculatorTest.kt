package com.bbl.samples

import org.assertj.core.api.Assertions
import org.junit.Test
import java.time.LocalDate

class AgeCalculatorTest {


    @Test
    internal fun should_john_age_be_equal_to_30() {
        // Given
        val person = Person("john" ,"smith", LocalDate.of(1983, 1, 1))

        // Then
        Assertions.assertThat(person.age()).isEqualTo(36)

    }
}