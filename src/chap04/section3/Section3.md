# 인라인(inline) 함수
- 함수가 호출되는 곳에 내용을 모두 복사
- 함수의 분기 없이 처리 -> 성능 증가

```kotlin
fun main(...) {
    ...
    sub() // 본문 abc로 복사됨
    ...
    sub() // 본문 abc로 복사됨
}

inline fun sub(...) {
    abc
}
```

# 인라인 함수의 제한과 인라인 금지
## 인라인 함수의 단점
- 코드가 복사되므로 내용이 많은 함수에 사용하면 코드가 늘어남

## noinline 키워드
- 일부 람다식 함수를 인라인 되지 않게 하기 위해

```kotlin
inline fun sub(out1: () -> Unit, noinline out2: () -> Unit) {}
```

## crossinline 키워드
- return 을 금지함

```kotlin
inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {}
```

## 확장 함수(extension function)
- 클래스의 멤버 함수를 외부에서 더 추가할 수 있다

```kotlin
fun 확장대상.함수명(매개변수, ...): 반환값 {
    ...
    return 값
}
```