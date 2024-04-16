package grammar.`class`

fun main() {
    val kim = Person("kim", 20)
    // 클래스 필드값 접근방식을 줄때는 val, var를 이용
    // 자바의 getter setter가 불필요하다.
    // kim.name = "dong" : 변경 불가능
    kim.age = 32 // 변경 가능
    println(kim)

    val kim2 = Person("kim", 20)
    println(kim2)
    println(kim == kim2) // false
    println(kim.hobby) // hobby도 접근 가능

//    kim.hands = "손이 있다" // error
}

// 클래스
//class Person(
//    val name: String,
//    //    private val name: String, // private 붙이면 getter(객체.name)를 막음
//    var age: Int, // 코틀린은 마지막에 컴마를 넣어도 에러가 나지 않음
//)
data class Person( // data를 붙이면 equals, hashcode, toString 까지 재정의해준다.
    val name: String,
    var age: Int,
) {
    var hobby = "독서" // 클래스 내부에 변수를 지정할 수 있다.
    var hands = "손이 있다"
        private set // setter를 private 하여 제한함
        get() = "하하 $field" // getter를 재정의 한다. $field를 이용해 기존값을 활용할 수 있다.

    init {
        print("init") // 생성자 기능 외에 다른걸 하고싶다면 init 블럭을 사용
    }

    fun some() {
        println(hobby)
    }
}