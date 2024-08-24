fun main() {

//    arithmatic_operators()

//    assignment_operator()

//    Unary_Operators()

//    Logical_operators()

//    Bitwise_Operations()
}

fun arithmatic_operators() {
    //    Kotlin Arithmetic Operators

    val x: Int = 40
    val y: Int = 20

    println("x + y = " + (x+y) )
    println("x - y = " + (x-y) )
    println("x / y = " + (x/y) )
    println("x * y = " + (x*y) )
    println("x % y = " + (x%y) )

    println("________________________________")

//    Kotlin Relational Operators
    println("x > y = " +  (x > y))
    println("x < y = " +  (x < y))
    println("x >= y = " +  (x >= y))
    println("x <= y = " +  (x <= y))
    println("x == y = " +  (x == y))
    println("x != y = " +  (x != y))

    println("________________________________")

    var xx = 100
    xx+=100
    println("xx = " +  xx)
}

fun assignment_operator() {

    println("=======  assignment_operator   =======")
    var x: Int = 40

    x += 5
    println("x += 5 = " + x )

    x = 40;
    x -= 5
    println("x -= 5 = " +  x)

    x = 40
    x *= 5
    println("x *= 5 = " +  x)

    x = 40
    x /= 5
    println("x /= 5 = " +  x)

    x = 43
    x %= 5
    println("x %= 5 = " + x)
}

fun Unary_Operators() {
    var x: Int = 40
    var b:Boolean = true

    println("+x = " +  (+x))
    println("-x = " +  (-x))
    println("++x = " +  (++x))
    println("--x = " +  (--x))
    println("!b = " +  (!b))
}

fun Logical_operators() {

    var x: Boolean = true
    var y:Boolean = false

    println("x && y = " +  (x && y))
    println("x || y = " +  (x || y))
    println("!y = " +  (!y))
}

fun Bitwise_Operations() {
    var x:Int = 60	  // 60 = 0011 1100
    var y:Int = 13	  // 13 = 0000 1101
    var z:Int

    z = x.shl(2)       // 240 = 1111 0000
    println("x.shl(2) = $z")

    z = x.shr(2)       // 15 = 0000 1111
    println("x.shr(2) = $z")

    z = x.and(y)       // 12 = 0000 1100
    println("x.and(y)  = " +  z)

    z = x.or(y)        // 61 = 0011 1101
    println("x.or(y)  = " +  z)

    z = x.xor(y)       // 49 = 0011 0001
    println("x.xor(y)  = " +  z)

    z = x.inv()        // -61 = 1100 0011
    println("x.inv()  = " +  z)
}