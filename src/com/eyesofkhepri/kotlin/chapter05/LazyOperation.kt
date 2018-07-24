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

    // map, filter가 실행할때마다 각각의 컬랙션을 새로 생성한다. 원본 컬랙션이 얼마 안될때는 상관없지만 많아지면 성능상에 이슈가 발생하기도 한다.
    println(humanList.map { it.name }    // name만 뽑아냄
            .filter { it.startsWith("H") })

    // sequence경우 위와 다르게 중간 중간 처리를 하면서 저장하는 것이 아닌 데이터가 필요할 경우 한번에 연산을 한다는 장점이 있다.
    // 여기선 toList하는 순간 map, filter계산이 이루어진다.
    println(humanList.asSequence()
            .map { it.name }    // name만 뽑아냄
            .filter { it.startsWith("H") }  // 앞에 H인 값만 뽑음
            .toList())  // 리스트로 변환

    val naturalNumbers = generateSequence(0) {it + 1}
    val numberTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numberTo100.sum())  // 최종연산 sum을 수행하기 전까지 위의 takeWhile로직이나 0부터 무제한 1씩 증가하는 sequence로직은 동작하지 않는다.

}





