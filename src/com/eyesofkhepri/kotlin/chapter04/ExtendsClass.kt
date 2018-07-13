package com.eyesofkhepri.kotlin.chapter04

fun main(args: Array<String>) {

}

// 상속받을 클래스를 만들려면 open 변경자를 써야한다.
// 상속을 위한 설계나 문서가 없을 경우 오버라이드 대상이 되는 클래스와 메소드가 아니라면 무조건 final로 만드는 철학을 따르기 위해서 기본적으로 kotlin은 final로 잡혀있다.
open class RichButton : Clickable {
    override fun click() {

    }
}