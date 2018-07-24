package com.eyesofkhepri.kotlin.chapter05

fun main(args: Array<String>) {
    val intList = listOf(1, 2, 3, 4)

    // filter는 컬랙션을 반복하면서 주어진 람다식이 true를 반환하는 원소만 모은다.
    println(intList.filter { it % 2 == 0 })

    // Map은 컬랙션을 반복하면서 주어진 람다식을 실행한 결과를 모은다.
    println(intList.map { it * it })


    val albumList = listOf(Album("album1", 10),
            Album("album2", 11),
            Album("album3", 35),
            Album("album4", 6),
            Album("album5", 20),
            Album("album6", 3))


    // 아래와 같은 코드는 성능에 악영향을 끼친다. 아래는 모든 list를 반복하며 검색하기 때문이다.
    albumList.filter { it.record == albumList.maxBy { it.record }!!.record }

    // 되도록이면 1번에 처리할수 있는 방안을 생각하자. 최고로 많은 record를 가진 엘범을 찾는다.
    val maxRecord = albumList.maxBy { it.record }!!.record
    println(albumList.filter { it.record == maxRecord })
}

data class Album(val name:String, val record:Int)


