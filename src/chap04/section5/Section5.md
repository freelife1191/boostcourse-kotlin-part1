# 함수의 실행 블록

## 함수의 블록({})
- 블록내에서 사용하는 변수 - 지역 변수(Local variable)

## 함수의 범위(Scope)
- 최상의 함수와 지역 함수

```kotlin
fun main() { // 최상위 레벨의 함수
    ...
    fun secondFunc(a: Int) { // 지역 함수 선언
        ...
    }
    userFunc(4) // 사용자 함수 사용 - 선언부의 위치에 상관 없이 사용
    secondFunc(2) // 지역 함수 사용 - 선언부가 먼저 나와야 사용 가능
}

fun userFunc(counts: Int) { // 사용자가 만든 최상위 레벨의 함수 선언
    ...
}
```

 ## 최상위 및 지역 함수의 사용 범위
 - 최상위 함수는 `main()` 함수 전, 후 어디든 선언하고 코드 내에서 호출 가능
 - 지역 함수는 먼저 선언되어야 그 함수를 호출할 수 있음

# 변수의 범위

## 전역 변수
- 최상위에 있는 변수로 프로그램이 실행되는 동안 삭제되지 않고 메모리에 유지
- 여러 요소가 동시에 접근하는 경우에 잘못된 동작을 유발할 수 있음
- 자주 사용되지 않는 전역 변수는 메모리 자원 낭비

## 지역 변수
- 특정 코드 블록 내에서만 사용
- 블록 시작 시 임시로 사용되며 주로 스택 메모리를 사용