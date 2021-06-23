package range

import java.util.*

fun main() {

//    range2_1()
    rangeDate()
}

fun range2_1() {
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

    for (i in intRange) {
        print(i)
    }
    println()

    for (i in charRange) {
        print(i)
    }
    println()
}

fun rangeDate() {
    val date1 = Date()
    val date2 = Date()
    val date3 = Date()

    if (date2 in date1..date3) {
        println(date1)
        println(date2)
        println(date3)
        println("yes!")
    }
}
