package grammar.`class`

fun main() {
    val computer = Computer()
    val science: Book = Science()

    if (computer is Computer) {
        println("컴퓨터 책이다")
        computer.describe()
        computer.read()
    }
    if (science is Book) {
        println("책이다")
        // science.describe() : error -> 타입이 Book이라 describe 메서드 사용불가
    }

    // as
    val thing = science as Thing
    println("강제 타입 변환 ${thing.describe()}")
}

