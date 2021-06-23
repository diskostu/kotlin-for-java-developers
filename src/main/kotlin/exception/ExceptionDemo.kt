package exception

fun main() {
    val number = 101

    val percentage = if (number in 0..100)
        number
    else
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")

    println(percentage)
}
