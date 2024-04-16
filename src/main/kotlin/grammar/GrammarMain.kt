package grammar

import java.lang.Integer.max
import java.lang.Integer.min
import java.util.Scanner

// 탑 레벨 상수
// 탑 레벨 상수에서 const를 사용할 수 있다.
// const: 컴파일 타임 상수로 만드는 역할
const val a = 1000;

fun main() {
  print("Hello, World!")
  println("Hello, World! 2")

  // 변수 선언
  var i = 10
  var j : Int = 10
  var str1 = "Hello, World!"
  var str2 : String = "Hello, World!"
  var d1 = 3.3
  var d2 : Double = 3.4

  // 상수 선언 : 자바의 final
  val a = 10
  val str = "My name is "
  val d = 3.3

  // 형 변환
  var e = 10
  var f = 20L // Long
  // f = e -> error
  // f = (Long) e -> error: 자바 문법처럼 안된다.
  // .to~ 를 쓰자
  f = e.toLong()
  e = f.toInt()

  // 문자열 자세히보기
  var name = "echul"
  print(name.uppercase())
  print(name.lowercase())
  print(name[0]) // e
  print("이름은 ${name} $name 입니다.") // string interpolation

  // max, min
  var max = Int.MAX_VALUE
  var min = Int.MIN_VALUE
  // Integer 안에 max, min 메서드 존재
  println(max(max, min))
  println(min(max, min))

  // random
  val randomNumber1 = kotlin.random.Random.nextInt(1, 100)
  println(randomNumber1)
  val randomNumber2 = kotlin.random.Random.nextDouble(1.0, 100.0)
  println(randomNumber2)

  // 키보드 입력
  val reader = Scanner(System.`in`) // 'in'은 코틀린에서 쓸 수 없는 키워드기 때문에 백틱으로 감싼다.
  print("숫자를 입력하세요: ")
  println(reader.nextInt())


  // 조건문
  var score = 80
  if (score >= 90) {
    println("A")
  } else if (score >= 80) {
    println("B")
  } else {
    println("C")
  }
  // if문 대신 when문 사용 가능
  when {
    score >= 90 -> {
      println("A")
    }
    score >= 80 -> {
      println("B")
    }
    else -> println("C")
  }
  // if문이 아닌 if식 이기 때문에 값을 받을 수 있다.
  var result = if (score >= 90) {
    "A" // 마지막 줄이 반환값
  } else if (score >= 80) {
    "B"
  } else {
    "C"
  }
  // 삼항 연산자
  var result2 = if (score >= 90) "A" else "B"


  // 반복문
  var items = listOf(1,2,3,4,5) // list
  for (item in items) {
    println(item)
  }
  items.forEach { item ->
      println(item)
  }
  for (i in 0..items.size-1) {
    print(items[i])
//    break
//    continue
  }
  // 자바와 같음
//  while (true) {
//    print("무한루프")
//  }

  // List
  val items1 = listOf(1,2,3,4,5) // 변경 불가능한 리스트
  val items2 = mutableListOf(1,2,3,4,5) // 변경 가능한 리스트 (원하는 인덱스테 추가삭제 가능)
  items2.add(6)
  items2.remove(6)

  // Array, List와 비슷
  val array1 = arrayOf(1,2,3,4,5)

  // 예외 처리
  try {
    val a = 10 / 0
  } catch (e: Exception) {
    println("예외 발생")
  } finally {
    println("예외 발생 종료")
  }

  // Null safty
  // val test1: String = null // error
  var test1: String? = "null" // nullable
  var test2: String = ""

//  test2 = test1 // error
  // 아래와 같이 체크 후에 사용해야한다.
  if(test1 != null) {
    test2 = test1
  }
//  test2 = test1!! !!는 ?를 때는 방법이다. 단, 개발자가 임의로 널이 아니라는걸 표시한 것이라 위험할 수 있다
  test1?.let { // 변수?.let 는 변수가 null이 아니라면, 블럭 조건을 수행한다.
    print("null이 아닙니다")
  }

  // 함수
  print(sum(1, 2))
  print(sum(a = 1, b = 2)) // 명시적으로 지정가능1
  print(sum(a = 1, b = 2, c = 0)) // 명시적으로 지정가능2
  print(sum(b = 2, a = 1, c = 0)) // 명시적으로 지정만 해준다면, 파라미터 순서는 상관이 없음.



}

// 함수
//fun sum(a: Int, b: Int): Int {
//  return a+b
//}
fun sum(a: Int, b: Int): Int = a + b // 한줄로 표현 가능, 파라미터 타입은 지우면 안됨
fun sum(a: Int, b: Int, c: Int = 0): Int = a + b + c // 파라미터 디폴트 값 지정가능