package com.eyesofkhepri.kotlin.chapter05

import com.eyesofkhepri.kotlin.domain.Human
import com.eyesofkhepri.kotlin.domain.Movie

fun main(args: Array<String>) {
    val strList = listOf("abc", "cdefgh")

    // flatmap은 주어진 람다식을 컬랙션의 모든 객체에 적용하고 적용한 결과에 대한 리스트의 값을 한리스트로 모은다.
    // abc, defgh를 각각list로 만들고 해당 리스트에 있는 각각의 값을 1개의 리스트로 만든다.
    println(strList.flatMap { it.toList() })

    val movieList = listOf(
            Movie("movie1", listOf("author1")),
            Movie("movie2", listOf("author2", "author3")),
            Movie("movie3", listOf("author3", "author4", "author5"))
    )

    // flatMap을 사용해서 authors들을 가져왓고 toSet을 통해서 중복 값을 없엤다. distinct같은경우 mutable로 변경해서 먼가 작업해서 성능상에 느릴지도?
    println(movieList.flatMap { it.authors }.toSet())
    //println(movieList.flatMap { it.authors }.distinct())

    // List<List>로 구성된 값에서는 flatten()을 사용해서 해당 값을 쭈욱 나열할 수 있다.
    val deepList = listOf(listOf(1), listOf(2, 3), listOf(4, 5, 6))
    println(deepList.flatten()) // [1, 2, 3, 4, 5, 6]

}





