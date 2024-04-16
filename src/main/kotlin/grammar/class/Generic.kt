package grammar.`class`

fun main() {
    val box = Box<Int>(10)
    val box2 = Box("10") // Diamond Operator는 생략 가능하다 ->

    println(box.value)
    println(box2.value)
}

class Box<T>(var value: T) // 제너릭 선언의 예