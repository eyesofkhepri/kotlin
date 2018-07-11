# 코드 읽는 순서.

## Chapter01

1. First : 예제 테스트

## Chapter02

1. HelloWorld.kt : Hello World 출력 방법과 함수선언에 대해 간략 설명
2. Max.kt : 함수 인자 설명 및 if가 식으로써 사용됨을 확인 할 수 있다.
3. SimpleMax.kt : 식을 사용하는 함수를 간략히 코드를 줄이는 방법을 확인 할 수 있다.
4. Variable.kt : 변수 선언시 var과 val에 관해서 설명을 하고 있다.
5. HelloWorld2.kt : $변수 같은 문자열 템플릿을 설명하고 있다.
6. Person.kt : 클래스 생성 및 사용하는 방법을 설명 한다.
7. Rectangle.kt : 클래스 생성 및 커스텀 프로퍼티와 해당 getter를 생성하는 방법을 설명하고 있다.
8. DirectoryPacakge.kt : 패키지와 import를 통해서 해당 함수나 클래스를 사용할 수 있는것을 보여준다.
9. EnumAndWhen.kt : Enum에 대한 설명과 When의 사용 방법을 설명하고 있다.
10. SmartCast.kt : is를 통해 타입을 비교하면 알아서 객체의 타입을 변환해주는 스마트 캐스트 기능을 설명한다. 그리고 if를 when으로 리팩토링 하는 장점을 설명한다.
11. loop.kt : while과 for 루프를 설명한다. for의 range를 설명한다. map을 Loop하는 방법을 설명한다.
12. loop2.kt : in과 !in의 차이를 설명한다.
13. ExceptionProcess.kt : 예외처리 방법을 설명한다. try가 식으로 써 쓰일수 있다는 것을 보여준다.

## Chapter03

1. CreateCollection.kt : 컬랙션 생성, 자바 컬랙션을 사용하는 이유 설명
2. EasyCallFun.kt :  함수 호출시 인자에 이름 붙이는 방법 설명, 디폴트 파라메터 설명
3. UseJoin.java : Kotlin은 클래스 외부에 함수를 선언할수 있으며 컴파일시 어떻게 변환되는지 그것을 어떻게 쓰는지 설명한다. @JvmName을 통해 클래스의 이름을 설정할 수 있고 사용하는 방법 설명.
4. TopProperties.kt : 클래스 외부에 함수를 선언한것 처럼 프로퍼티도 클래스 외부에 선언이 가능하다. static final같은 상수 변수를 만드는 방법 const를 설명한다.
5. ExpendFun.kt : 확장 함수 선언 및 사용
6. use/UseExpendFun.kt : 확장 함수 사용시 import해야 함을 설명 중복의 문제로 인해서 import를 통해 사용하도록 한다. 동일 패키지내에 동일한 이름을 갖는 확장 함수는 컴파일 단계에서 허용하지 않는다. 중복되는 확장함수를 가진 Class를 import할경우도 컴파일 단계에서 허용하지 않는다.
7. UseExpendJoin.kt : 확장함수를 사용해서 간단한 기능을 구현해본다.
8. NotOverrideExpendFun.kt : 확장 함수는 오버라이드 하지 못함을 설명한다. 확장함수는 선언한 클래스안에 생성이 되는것이 아니라 파일이름으로 생성되는 클래스 안에 static으로 생성이 된다.