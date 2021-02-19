package chap04.section1

fun main() {
    // 인자와 함께 사용하는 경우
    withArgs("Arg1", "Arg2", { a, b -> "Hello World! $a $b" }) // 1
    // withArgs()의 마지막 인자가 람다식인 경우 소괄호 밖ㅌ으로 분리 가능
    withArgs("Arg1", "Arg2") { a, b -> "Hello World! $a $b" } // 2
}
// withArgs 함수는 일반 매개변수 2개를 포함, 람다식 함수를 마지막 매개변수로 가짐
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}