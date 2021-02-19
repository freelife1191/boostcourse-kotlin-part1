package chap04.section1

fun main() {
    twoLambda({ a, b -> "First $a $b" }, {"Second $it"})
    twoLambda({ a, b -> "First $a $b" }) {"Second $it"} // 위와 동일
    // ({첫 번째}, {두 번째})
    // ({첫 번째}) {두 번째}
    // ({첫 번째}, {두 번째}) {세 번째}
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}