package chap04.section2

fun main() {
    println(funcParam(3, 2, ::sum))

    fun sum(x: Int, y: Int) = x + y
}

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}