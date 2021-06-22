package range

import java.util.*

fun main() {

    val intRange = 1..9
    val charRange = 'a'..'z'
    val stringRange = "ab".."az"

    val startDate = GregorianCalendar.getInstance()
    startDate.set(2000, 10, 10)
    val endDate = GregorianCalendar.getInstance()
    val dateRange: ClosedRange<Calendar> = startDate..endDate

    println(intRange)
    println(charRange)
    println(stringRange)
    println(dateRange)
    println()

    for(i in intRange) {
        print(i)
    }
    println()

    for(i in charRange) {
        print(i)
    }
    println()
}
