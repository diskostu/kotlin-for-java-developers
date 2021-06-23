package range

fun isValidIdentifier(s: String): Boolean {

    fun isValidCharacter(ch: Char) =
        ch == '_' ||
        ch in '0'..'9' ||
        ch.lowercaseChar() in 'a'..'z'

    if (s.isBlank() || s[0] in '0'..'9') return false

    for (ch in s) {
        if (!isValidCharacter(ch)) {
            return false
        }
    }

    return true
}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
