package extension

/**
 * Gets the last character of the given String
 */
fun String.lastChar(): Char {
    if (this.isBlank()) throw IllegalArgumentException()
    return get(length - 1)
}
