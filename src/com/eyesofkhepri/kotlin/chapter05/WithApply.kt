package com.eyesofkhepri.kotlin.chapter05

import com.eyesofkhepri.kotlin.domain.Human

fun main(args: Array<String>) {
    val humanList = listOf<Human>(
            Human("Human1", 10),
            Human("Human2", 20),
            Human("Human3", 40),
            Human("Human4", 30),
            Human("Human5", 60),
            Human("Human6", 70)
    )

    println(alphabet())
    println(useWithAlphabet())
    println(useApplyAlphabet().toString())

}

fun alphabet(): String {
    val result = StringBuilder()
    for(letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I Know the alphabet!")
    return result.toString()
}

fun useWithAlphabet(): String {
    val result = StringBuilder()

    // with메소드 인자로 반환할 객체를 선언한다.
    // 사실 얘는 인자가 2개이다. 1번재 인자는 반환객체, 2번째 인자는 람다식
    // 예전에 도 이야기 햇듯이 람다식이 마지막에 존재시 {}를 사용할 수 잇다고 했었따.
    return with(result) {
        for(letter in 'A'..'Z') {
            this.append(letter) // this를 사용해 반환할 객체의 메소드를 호출한다.
        }
        append("\nNow I Know the alphabet!")    // 반환할 인자 this자체를 생략할 수 있다.
        toString()  // 람다에서 값을 반환한다. 언제나 {}의 마지막에 있는 값이 return 값이 된다.
    }
}

fun useApplyAlphabet(): StringBuilder {
    // Apply는 해당 객체 자체를 반환한다.
    return StringBuilder().apply {
        for(letter in 'A'..'Z') {
            append(letter) // this를 사용해 반환할 객체의 메소드를 호출한다.
        }
        append("\nNow I Know the alphabet!")    // 반환할 인자 this자체를 생략할 수 있다.
    }
}

// 이러한 apply나 with는 객체의 인스턴스를 만들면서 즉시 프로퍼티중 일부를 초기화 할 경우 유용하게 쓰인다.