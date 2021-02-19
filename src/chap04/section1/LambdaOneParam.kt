package chap04.section1

/**
 * 매개변수가 한 개인 경우
 */
fun main() {

    //매개변수가 하나 있는 람다식 함수
    oneParam ({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" } // 위와 동일 결과, 소괄호 생략 가능
    oneParam { "Hello World! $it" } // 위와 동일 결과, it으로 대체 가능
}

// 매개변수가 하나 있는 람다식 함수가 oneParam함수의 매개변수 out으로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}