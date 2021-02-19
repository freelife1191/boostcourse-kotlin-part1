package chap04.section2

/**
 * 익명 함수
 * 일반 익명 함수에서는 return, break continue가 사용 가능하지만 람다식에서는 사용하기 어렵다
 * (라벨 표기법과 같이 사용해야 함)
 */
fun main() {
    // fun (x: Int, y: Int): Int = x + y // 함수 이름이 생략된 익명 함수

    val add: (Int, Int) -> Int = fun(x, y) = x + y // 익명 함수를 사용한 add 선언
    // val add = fun(x: Int, y: Int) = x + y
    // var add = {x: Int, y: Int -> x + y} // 람다식과 매우 흡사
    val result = add(10, 2) // add의 사용
}

