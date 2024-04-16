package grammar.`class`

// 콜백함수에 대해서
fun main() {
    myFunc({
        println("함수 호출")
    })
    // 인자가 함수일 경우, 아래와 같이 밖으로 뺄 수 있다
    myFunc { // 인자가 이 콜백함수 하나라면, 소괄호를 지워도 된다
        println("함수 호출1")
    }
    myFunc2(10) {
        println("함수 호출2")
    }
    myFunc3(10) // 콜백을 디폴트로 정했다면, 이렇게 블럭을 안만들어도 된다.
}

fun myFunc(callBack : () -> Unit) { // 파라미터에 콜백함수 지정
    println("1 함수시작!")
    callBack()
    println("1 함수끝!")
}

fun myFunc2(i: Int, callBack : () -> Unit) { // 파라미터에 콜백함수 지정
    println("2 함수시작!")
    callBack()
    println("2 함수끝!")
}

fun myFunc3(i: Int, callBack : () -> Unit = {}) { // 콜백함수 또한 디폴트를 정해줄 수 있다
    println("3 함수시작!")
    callBack()
    println("3 함수끝!")
}