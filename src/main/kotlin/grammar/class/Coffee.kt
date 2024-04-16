package grammar.`class`

// 상속
//open class Drink // 일반적인 클래스를 상속하려면 class 앞에 open을 꼭 붙여주자
abstract class Drink { // 추상 클래스
    open fun feel() { // open 키워드를 써줘야 자식 클래스가 오버라이드 가능하다.
        print("음료 맛을 느끼다")
    }
}

// class Coffee : Drink() // 상속은 괄호 써야함!
class Coffee : Drink() {
    override fun feel() {
        println("커피는 잠이 안오는 맛")
    }
}
class Tea : Drink() {
    override fun feel() {
        println("차는 차분해")
    }
}