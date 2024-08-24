fun main() {


//    gameWithFunction()
    println("------------")

    highOrderFunction()
    println("------------")
}

fun gameWithFunction() {
    val a = 20
    val b = 10

    printSum(a,b)
    println("------------")

    val sum = getSum(a,b)
    println("Summation is: " + sum)
    println("------------")


    val fact = getFactorial(5)
    println("Factorial: $fact")
    println("------------")
}

fun printSum(a: Int, b:Int) {
    println("Sum is " + (a+b))
}

fun getSum(a: Int, b: Int):Int {
    val sum = a+b
    return sum
}

fun getFactorial(x: Int): Int {
    if(x==0) return 1
    return x * getFactorial(x-1)
}

fun highOrderFunction() {
    val result = calculate(4,5, ::addTwoNumber)
    println("Result: $result")
}

fun addTwoNumber(a: Int, b: Int) = a + b

fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int):Int {
    return operation(a,b)
}
