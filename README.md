# 코드 읽는 순서.

## Chapter01

1. First
<pre>
클래스를 생성하고 클래스의 객체를 List 변수에 담아서 리스트의 maxBy함수를 사용해 출력하는 간단한 코드를 설명한다.
</pre>

## Chapter02

1. HelloWorld.kt
<pre>
HelloWorld 한문장을 출력하는 예제이다.
(1) fun키워드를 사용해서 함수를 생성하는 것을 알 수 있다.
(2) 함수의 파라메터의 타입을 파라메터 뒤에 쓰는 것을 알 수 있다.
(3) 함수를 class안에 선언하지 않아도 실행이 되는 것을 알 수 있다.
(4) 줄 끝에 세미콜론(;)을 붙이지 않아도 됨을 알 수 있다.
(5) 개행출력을 println() 사용해서 할 수 있음을 알 수 있다.
</pre>

2. Max.kt : 함수 인자 설명 및 if가 식으로써 사용됨을 확인 할 수 있다.
<pre>
2개의 Int값을 받고 그중에 큰 값을 반환하는 max라는 함수 선언과 실행의 예제이다. 여기서 아래의 지식을 알 수 있다.
(1) 함수는 값을 반환 할 수 있다. 그리고 파라메터가 담기는 괄호 '()' 다음에 반환 타입을 선언함을 알 수 있다.
(2) 조건식 if의 사용법을 알 수 있다.
(3) Java와 다르게 if는 조건문이 아니라 조건식임을 알 수 있다.
</pre>

3. SimpleMax.kt : 식을 사용하는 함수를 간략히 코드를 줄이는 방법을 확인 할 수 있다.
<pre>
if문이 조건식이므로 좀 더 코드를 간략하게 사용하여 동일 기능이지만 코드량이 작은 simpleMax1과 simpleMax2의 함수 선언과 실행의 예제이다.
(1) 식이 본문일 경우 함수는 컴파일 시점에 식을 분석해서 식의 결과를 함수의 반환 타입으로 정해버리는 것을 알 수 있다.
(2) 식이 본문일 경우 괄호('{}')를 사용하지 않고 '='을 사용해서 함수를 선언 할 수 있음을 알 수 있다. 
</pre>

4. Variable.kt : 변수 선언시 var과 val에 관해서 설명을 하고 있다.
<pre>
var과 val의 변수 여러개를 선언하고 변수를 사용하는 예제이다.
(1) val(immutable), var(mutable)의 차이점을 알 수 있다.
(2) 변수를 초기화 하면서 선언시 타입을 명시적으로 선언 하지 않아도 자동으로 지정하는 것을 알 수 있다.
(3) 변수를 초기화 하지 않으면서 선언할 경우 타입추론(type inference)이 불가능하기 때문에 타입을 명시적으로 선언해줘야 하는 것을 알 수 있다.
(4) val이 불변(immutable)이라고 할지라도 변수내부의 참조값이 가르키는 객체의 값은 변경 될 수 있음을 알 수 있다.
(5) 변수에 값을 할당시 변수의 타입이 틀릴 경우 오류가 발생함을 알 수 있다.
</pre>

5. HelloWorld2.kt : $변수 같은 문자열 템플릿을 설명하고 있다.
<pre>
println과 문자열 템플릿을 사용하여 변수의 값을 출력하는 예제이다.
(1) 달러기호('$')를 사용하여 쌍따옴표(") 안에서 변수를 사용하는 법을 알 수 있다.
(2) $같은 특수기호를 문자로 표시하고 싶다면 역슬러시(\)를 사용해야 하는 것을 알 수 있다.
(3) 쌍따옴표안에서 딸러+괄호('${}')를 통해서 식이나 배열의 값을 사용할 수 있음을 알 수 있다.
(4) $변수 바로 뒤에 변수이름을 의미 할수 있는 문자열이 어떠한 것이라도 들어가면 변수이름+문자열을 변수로 인식해서 오류를 발생함을 알 수 있다.
(5) $숫자+변수 처럼 사용할 경우 변수가 아닌 문자로 인식함을 알 수 있다.
</pre>

6. Person.kt : 클래스 생성 및 사용하는 방법을 설명 한다.
<pre>
Person 클래스를 선언하고 사용하는 예제이다.
(1) value object(VO)형태의 클래스를 선언 하는 방법을 알 수 있다.
(2) 코틀린의 기본 가시성(visibility)은 Public임을 알 수 있다.
(3) 클래스 선언부에 클래스의 프로퍼티를 읽기 전용으로 선언하는 방법을 알 수 있다.
(4) Java와 틀리게 new를 사용하지 않고 클래스의 객체를 생성함을 알 수 있다.
(5) val와 var에 따라서 자동으로 getter와 setter를 생성해주는 것을 알 수 있다.
(6) 객체.프로퍼티 형태로 알아서 getter와 setter를 사용해서 값을 저장하고 사용 함을 알 수 있다.
</pre>

7. Rectangle.kt : 클래스 생성 및 커스텀 프로퍼티와 해당 getter를 생성하는 방법을 설명하고 있다.
<pre>
Ractangle 클래스를 선언하고 본문에 프로퍼티를 선언하고 해당 프로퍼티의 getter를 커스텀 하고 사용하는 예제이다.
(1) 본문에 프로퍼티를 선언하는 방법을 알 수 있으며 선언과 동시에 초기화 해주지 않으면 오류가 발생하는 것을 알 수 있다.
(2) 본문에 선언한 프로퍼티의 커스텀 Getter를 만드는 방법을 알 수 있다.
(3) 커스텀 Getter를 좀더 간단하게 만드는 방법을 알 수 있다.
(4) 객체 생성시 입력한 파라메터의 값을 커스텀 Getter에서 사용할 수 있음을 알 수 있다.
</pre>

8. DirectoryPacakge.kt : 패키지와 import를 통해서 해당 함수나 클래스를 사용할 수 있는것을 보여준다.
<pre>
java의 java.util.* 패키지를 import하고 랜덤함수를 사용하는 예제이다.
(1) kotlin안에서 java의 패키지나 클래스를 import하고 사용 할 수 있음을 알 수 있다.
(2) 스타 임포트(.*)를 사용해서 해당 패키지 안에 클래스 및 최상위에 정의된 함수, 프로퍼티를 사용 할 수 있음을 알 수 있다.
</pre>

9. EnumAndWhen.kt : Enum에 대한 설명과 When의 사용 방법을 설명하고 있다.
<pre>
ENUM 클래스 Color와 FreeColor를 선언하고 이 클래스를 사용하는 getMnemonic, getWarmth, mix, maxOptimized 함수를 선언하고 사용하는 예제이다.
(1) enum을 사용해서 enum을 통해 생성된 상수들을 열거 할 수 있다.
(2) enum을 통해 생성된 상수에 클래스 인자로 넘어온 값을 프로퍼티로 지정할 수 있다.
(3) enum class 안에 선언된 메소드들은 enum class 내부에 열거된 상수에 종속이 됨을 알 수 있다.
(4) 여러줄을 비교식으로 가지는 when의 사용법을 알 수 있다.
(5) when은 java와 다르게 break문을 가지지 않음을 알 수 있다.
(6) when의 비교식에서 여러 값을 비교시 콤마(,)를 사용해야 하는 것을 알 수 있다.
(7) when의 비교식에 eles를 사용해서 모든 조건에 해당하지 않을 경우 실행 되는 부분을 만들 수 있다.
(8) when의 비교대상이 될 곳에 아무런 객체나 객체를 생성하는 함수, 또는 식이 들어올 수 있다. 또한 무명객체도 들어갈 수 있다.
(9) when의 비교대상이 될 곳에 아무 인자를 주지 않고 사용 할 수 있다. when(객체생성로직)이 들어 갈 경우 해당 객체를 계속 생성하기에 이럴 경우 when에 아무런 비교대상을 주지 않고 사용함이 더 성능에 좋다는 것을 알 수 있다. 
</pre>

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
9. ExpendProperties.kt : 확장 프로퍼티에 관해서 설명한다.
10. DynamicParameterFun.kt : 가변 인자 함수에 관해서 설명한다.
11. InfixCalling.kt : 중위 호출에 관해서 설명한다. 구조분해 설명
12. ThreeDot.kt : 3중 따옴표를 통해서 문자열을 내마음대로 만드는 방법을 설명한다.

## Chapter04

1. UsingInterface.kt : 인터페이스 생성 및 구현, 디폴트 메소드 생성 및 사용법 설명
2. ExtendsClass.kt : 클래스 확장 설명
3. AbstractClass.kt : 추상 클래스 설명
4. Visibility.kt : 가시성 설명
5. NestedClass.kt : 중첩 클래스 설명
6. SealedClass.kt : Sealed(봉인된) 클래스 설명
7. ConstractClass.kt : 클래스 초기화와 초기화 블록 및 생성자에 관해서 설명, 비공개 생성자 설명
8. SecondConstructor.kt : 부생성자 설명
9. ImplInterfaceProperty.kt : 인터페이스에 잇는 속성 구현, 속성에 대한 초기화 방안 3가지를 설명한다. 또한 getter, setter의 뒷받침 필드에 접근하고 사용하는 방법을 설명한다.
10. ChangedViews.kt : 접근자의 가시성 변경방법에 관해 설명
11. OverrideDefaultMethods.kt : 모든 클래스가 정의할 메소드 오버라이드, 이런 기본적인 메소드 자동 생성
12. MandateClass.kt : 데코레이터 패턴을 사용해 대상이될 메소드의 생성 위임을 by 키워드를 사용한 클래스에게 구현에 대한 행동을 위임 시키는 방법에 관해 설명한다.
13. ObjectKeyword.kt : object 키워드를 사용한 싱글톤 사용하는 방법에 관해 설명한다.
14. ObjectFactoryStatic.kt : object 키워드를 사용해서 팩토리 메소드와 정적 멤버 생성 방법을 설명한다.
15. CompanionNomal.kt : Companion object를 일반 객체처럼 사용하는 방법 설명. 동반객체에 interface를 구현해서 사용하는 것을 설명한다.
16. ExtendMethodByCompanion.kt : companion object에 확장 함수를 넣는 방법을 설명한다.
17. AnonymousFunction.kt : 무명 내부 클래스를 작성
 
## Chapter5

1. DirectCollectionByLamdaLoop : 람다식을 사용하지 않고 컬랙션을 직접 검색하는 예제와 람다식을 사용한 예제이다.
2. UseValInLamda.kt : 람다식안에서 변수에 접근 하는 예제이다.
3. MemberReference.kt : 맴버참조를 사용하는 예제이다.
4. FilterAndMap.kt : filter와 map을 사용하는 예제이다.
5. AllAnyCountFind.kt : All, Any, Count, Find를 사용하는 예제이다.
6. GroupBy.kt : GroupBy를 사용하는 예제이다.
7. FlatMapFlatten.kt : FlatMap과 Flatten을 사용하는 예제이다. 
8. LazyOperation.kt : Sequence를 사용한 지연 연산에 관한 예제이다.
9. WithApply.kt : with와 apply 사용 예제이다.

