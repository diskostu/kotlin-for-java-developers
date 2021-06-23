package range

class Challenge {

    companion object {
        fun isValidIdentifier(s: String): Boolean {

            // function inside function - neat
            fun isValidCharacter(ch: Char): Boolean =
                ch == '_' ||
                ch.isLetterOrDigit() // equivalent: ch in '0'..'9' || ch.lowercaseChar() in 'a'..'z'

            if (s.isBlank() || s[0].isDigit()) return false

            for (ch in s) {
                if (!isValidCharacter(ch)) {
                    return false
                }
            }

            return true
        }
    }
}
