package range

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class ChallengeKtTest {

    @ParameterizedTest
    @CsvSource("name", "_name", "_12")
    fun `strings which are a valid indentifier `(s:String) {
        // arrange / act / assert
        assertThat(isValidIdentifier(s)).isTrue
    }

    @ParameterizedTest
    @CsvSource("012", "no$")
    fun `strings which are not a valid indentifier `(s:String) {
        // arrange / act / assert
        assertThat(isValidIdentifier(s)).isFalse
    }

    @Test
    fun `empty string is not a valid indentifier `() {
        // arrange / act / assert
        assertThat(isValidIdentifier("")).isFalse
    }
}
