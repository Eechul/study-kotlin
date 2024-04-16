package grammar.`class`

// 인터페이스
interface Book {
    fun read()
}

abstract class Thing {
    fun describe() {
        println("딱딱하게 생기다")
    }
}

class Computer: Thing(), Book { // interface는 소괄호를 쓰지 않는다
    override fun read() {
        println("컴퓨터 관련 책을 읽다")
    }
}

class Science: Thing(), Book {
    override fun read() {
        println("과학 관련 책을 읽다")
    }
}