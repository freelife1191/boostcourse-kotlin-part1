package chap02.section4

/*
4.shl(bits) 4를 표현하는 비트를 bits만큼 왼쪽으로 이동(부호 있음)
7.shr(bits) 7을 표현하는 비트를 bits만큼 오른쪽으로 이동(부호 있음)
12.ushr(bits) 12를 표현하는 비트를 bits만큼 오른쪽 이동(부호 없음)
9.and(bits) 9를 표현하는 비트와 bits를 표현하는 비트로 논리곱 연산
4.or(bits) 4를 표현하는 비트와 bits를 표현하는 비트로 논리합 연산
24.xor(bits) 23를 표현하는 비트와 bits를 표현하는 비트의 배타적 연산
78.inv 을 표현하는 비트를 모두 뒤집음
*/

fun main() {
    var a: Int = 10
    var b: Int = 10

    var result1 = ++a
    var result2 = b++

    println("result1: $result1, result2: $result2")
    println("a: $a, b: $b")
}