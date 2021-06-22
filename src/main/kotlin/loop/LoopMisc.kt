fun main() {

    step1()
    step2()
    step3()
    forChar1()
    forChar2()
}

fun step1() {
    for (i in 1..9) {
        print(i)
    }
    println()
}

fun step2() {
    for (i in 1 until 9) {
        print(i)
    }
    println()
}

fun step3() {
    for (i in 9 downTo 1 step 2) {
        print(i)
    }
    println()
}

fun forChar1() {
    for (ch in "abc") {
        print(ch + 1)
    }
    println()
}

fun forChar2() {
    for (c in '0' until '9') {
        print(c)
    }
}
