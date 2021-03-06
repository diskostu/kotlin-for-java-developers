package extension

/**
 * Gets the last character of the given String
 */
fun String.lastChar(): Char {
    if (isBlank()) throw IllegalArgumentException("The given String is blank.")
    return get(length - 1)
}
