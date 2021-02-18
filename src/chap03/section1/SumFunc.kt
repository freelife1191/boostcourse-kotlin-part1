package chap03.section1

/*
fun sum(a: Int, b: Int): Int {
    return a + b
}
*/
fun sum(a: Int = 2, b: Int = 5) = a + b

/*
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
*/
fun max(a: Int, b: Int) = if (a > b) a else b

/*
fun outfunc(name: String): Unit {
    println("Name: $name")
    //return Unit; // 아무런 형태를 지정하지 않았다는 반환값 지정하지 않아도 자동 처리됨
}
*/
fun outfunc(name: String) = println("Name: $name")

fun main() { // 최상위 (Top-level) 함수
    val result1 = sum(2, 3)
    val result3 = sum()
    val a = 3
    val b = 5

    val result2 = max(a, b)
    outfunc("Kildong")
    println(result1)
    println(result2)
    println(result3)
}