package chap04.section5

/**
 * Created by KMS on 2021/02/21.
 */
var global = 10

fun main() {

    fun localFun1() {
        println("localFunc1")
    }
    localFun1()

    global = 15
    val local1 = 15
    println("global: $global")
    userFunc()
    println("final - global: $global, local1: $local1")

}

fun userFunc() {
    global = 20
    val local1 = 20
    println("userFunc - global: $global, local1: $local1")
}