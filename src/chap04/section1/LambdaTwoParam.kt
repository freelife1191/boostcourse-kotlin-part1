package chap04.section1

fun main() {
    // 매개변수가 두 개 있는 람다식 함수
    moreParam { a, b -> "Hello World! $a $b"} // 매개변수명 생략 불가
    // 매개변수를 생략하는 경우
    moreParam { _, b -> "Hello World! $b"}
}
// 매개변수가 두 개 있는 람다식 함수가 moreParam 함수의 매개변수로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}