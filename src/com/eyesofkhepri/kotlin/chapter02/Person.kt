package com.eyesofkhepri.kotlin.chapter02

fun main(args: Array<String>) {
    val person = Person("Bob", true);
    println("이름: ${person.name}, 결혼여부: ${person.isMarried}");
}

class Person(
    val name: String,   // val 읽기 전용 속성임, 비공개 필드와 getter를 만든다.
    var isMarried: Boolean  // var 읽고 쓰기 전용 속성임, 비공개 필드와 getter, setter를 만든다.
)