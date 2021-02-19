package chap04.section1

fun main() {
    val result: Int

    // val multi = { a: Int, b: Int -> a * b}
    // val multi: (Int, Int) -> Int = { a: Int, b: Int -> a * b }
    // val multi: (a: Int, b: Int) -> Int = { a, b -> a * b }
    val multi: (a: Int, b: Int) -> Int = { a, b ->
        println("a: $a, b: $b")
        a * b
    }

    // 반환 자료형이 없거나 매개변수가 하나 있을 때
    val greet:() -> Unit = { println("Hello World") }
    val square: (Int)->Int = { x -> x * x }

    // 람다식 안에 람다식
    val nestedLambda: () -> () -> Unit = { { println("nestedLambda") } }

    // 선언부의 자료형 생략
    // val greet = { println("Hello World!") } // 추론 가능
    // val square = { x: Int -> x * x } // 선언 부분을 생략하려면 x의 자료형을 명시해야 함
    // val nestedLambda = { { println("nested") } } // 추론 가능

    result = multi(10, 20)
    println(result)
}