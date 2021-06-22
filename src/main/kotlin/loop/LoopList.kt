fun main() {
    val list = listOf("a", "b", "c")

    // 4 different ways of doing a simple loop
    loop1(list)
    loop2(list)
    loop3(list)
    loop4(list)
}

fun loop1(list: List<String>) {
    println("loop1")
    for (s: String in list) {
        println(s)
    }
}

fun loop2(list: List<String>) {
    println("loop2")
    list.forEach { s ->
        println(s)
    }
}

fun loop3(list: List<String>) {
    println("loop3")
    list.forEachIndexed { index, s ->
        println("index $index, value $s")
    }
}

fun loop4(list: List<String>) {
    println("loop4")
    for ((index, s) in list.withIndex()) {
        println("index $index, value $s")
    }
}
