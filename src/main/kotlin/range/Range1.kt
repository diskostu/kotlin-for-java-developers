package range

fun main() {
    println(isLetter('q'))
    println(isLetter('*'))

    println(recognize('1'))
    println(recognize('q'))
    println(recognize('*'))
}

fun range1() {
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know. :/"
}
