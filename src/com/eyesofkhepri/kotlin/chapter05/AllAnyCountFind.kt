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

    val age30Up = { h:Human -> h.age > 30 }

    // all은 모든 컬랙션이 해당 조건을 만족하면 true 아니면 false를 반환한다.
    println("Human all = ${humanList.all(age30Up)}")
    // any는 모든 컬랙션중에 해당 조건이 하나라도 만족하면 true를 반환한다.
    println("Human any = ${humanList.any(age30Up)}")
    // count는 모든 컬랙션중에 해당 조건이 만족하는 목록의 갯수를 반환한다.
    println("Human count = ${humanList.count(age30Up)}")
    // find는 모든 컬랙션중에 해당 조건이 만족하는 목록중 최초 1개만 반환한다.
    println("Human find = ${humanList.find(age30Up)}")
    // firstOrNull은 find와 같다.
    println("Human firstOrNull = ${humanList.firstOrNull(age30Up)}")



}





