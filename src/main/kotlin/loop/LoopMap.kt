fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    // different ways of doing a simple loop
    loop1(map)
    loop2(map)
}

fun loop1(map: Map<Int, String>) {
    for ((key, value) in map) {
        println("$key = $value")
    }
}

fun loop2(map: Map<Int, String>) {
    map.forEach { (key, value) ->
        println("$key = $value")
    }
}
