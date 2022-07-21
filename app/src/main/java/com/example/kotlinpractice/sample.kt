package com.example.kotlinpractice

fun main(){
    helloWord()
    println(add(4, 5)) //4+5 = 9

    //3. String Template
    val name = "yeon"
    val lastName = "Lim"
    println("my name is ${name}i'm 18") //걍 대괄호 써주기
    println("is this true? ${1==0}") //false
    println("this is 2\$") //$쓰고 싶으면 \$

    checkNum(5)

}



//1. 함수
fun helloWord() { //리턴형식이 없을때 Unit(void랑 비슷)
    println("Hello World!") //출력
}

fun add(a:Int, b:Int) : Int{ //리턴해야하기 때문에 생략 불가
    return a+b
}

//2. val과 var의 차이점
//val = value
fun hi() {
    val a: Int = 10
    var b: Int = 9
    //a=100 val은 상수라서 값 다시 넣기 불가능
    b = 100

    //타입추론 해줌 => 타입 생략가능
    val c = 100
    var d = 100
    var name = "yeon"
    //예외
    //var e
    //바로 값 안넣어 주면 타입추론 불가
}
    //4. 조건식
    fun maxBy(a:Int, b:Int) = if(a>b) a else b
    //삼항연산자가 없는 대신 저렇게 사용

    fun checkNum(score:Int){
        //약간 swich문..?
        when(score){
            0 -> println("this is 0")
            1 -> println("this is 1")
            2,3 -> println("this is 2 of 3")
            else -> println("?") //else 생략 가능
        }

        var f:Int = when(score){
            1 -> 1
            2 -> 2
            else -> 3 //f에다가 값 넣기
        }

        println("f : ${f}")

        when(score){
            in 90..100 -> println("woww") //90부터 100
            else -> println("okey")
        }


    }

