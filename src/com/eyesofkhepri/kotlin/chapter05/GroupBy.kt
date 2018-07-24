package com.eyesofkhepri.kotlin.chapter05

import com.eyesofkhepri.kotlin.domain.Human

fun main(args: Array<String>) {
    val humanList = listOf<Human>(
            Human("Human1", 10),
            Human("Human2", 20),
            Human("Human3", 40),
            Human("Human4", 40),
            Human("Human5", 60),
            Human("Human6", 70)
    )
    // groupBy는 인자값을 기준(Key)로 삼아서 해당 그룹을 만들어주는 역할을 담담한다.
    // 아래 같은 경우 Map<Int, List<Human>> 값을 반환한다.
    println(humanList.groupBy{ it.age })


    val stringList = listOf("a", "ab", "c")
    // 글자 맨앞에 있는 값을 기준(Key)로 삼아서 해당 그룹을 만들어주는 역할을 한다.
    println(stringList.groupBy { it.first() })
}





