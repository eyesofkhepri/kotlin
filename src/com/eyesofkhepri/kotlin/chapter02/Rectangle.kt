package com.eyesofkhepri.kotlin.chapter02

fun main(args: Array<String>) {
    val r1 = Ractangle(1,1)
    println(r1.isSquare)
    println(r1.isSquare2)
}

class Ractangle(val width: Int, val height: Int) {
    // 커스텀 isSquare프로퍼티와 해당 getter를 생성
    val isSquare: Boolean
    get() { // isSquare의 프로퍼티 getter 선언
        return height == width
    }

    // 간단하게 getter를 만들수 있다.
    val isSquare2 get() = height == width
}
