package chap04.section3

/**
 * this는 확장 대상에 있던 자리의 문자열인 source 객체를 나타냄
 * 기존의 표준 라이브러리를 수정하지 않고도 확장
 */
fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

// String을 확장해 getLongString 추가
fun String.getLongString(target: String): String = if (this.length > target.length) this else target