package extension

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertFailsWith

internal class MyExtensionsKtTest {
    @Test
    fun `lastChar should throw exception when input is empty`() {
        // arrange
        val string = ""

        // act
        val exception = assertFailsWith<IllegalArgumentException> { string.lastChar() }

        // assert
        Assertions.assertThat(exception.message).contains("blank")
    }


    @ParameterizedTest
    @CsvSource("abc,c", "x,x")
    fun `lastChar works as designed `(string: String, expectedChar: Char) {
        // arrange (done via parameter)

        // act
        val lastChar = string.lastChar()

        // assert
        Assertions.assertThat(lastChar).isEqualTo(expectedChar)
    }


    /**
     * This test is not necessary, but I leave it for instruction purposes. The method-to-test is never called.
     */
    @Test
    fun `lastChar should throw exception when input is null `() {
        // arrange
        val string = null

        // act
        val lastChar = string?.lastChar()

        // assert
        Assertions.assertThat(lastChar).isNull()
    }
}
