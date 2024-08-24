

fun main() {

//    create_boolean_variables()

//    Boolean_Operators()

//    Boolean_Expression()

//    and_or()

//    Boolean_to_String()
}

fun create_boolean_variables() {
    val isSummer: Boolean = true
    val isCold: Boolean = false

    println(isSummer)
    println(isCold)
}

fun Boolean_Operators() {
    var x: Boolean = true
    var y: Boolean = false

    println("x && y = " + (x && y))
    println("x || y = " + (x || y))
    println("!x = " + (!x))
}

fun Boolean_Expression() {
    val x: Int = 40
    val y: Int = 20

    println("x > y = " +  (x > y))
    println("x < y = " +  (x < y))
    println("x >= y = " +  (x >= y))
    println("x <= y = " +  (x <= y))
    println("x == y = " +  (x == y))
    println("x != y = " +  (x != y))
}

fun and_or() {
    val x: Boolean = true
    val y: Boolean = false
    val z: Boolean = true

    println("x.and(y) = " +  x.and(y))
    println("x.or(y) = " +  x.or(y))
    println("x.and(z) = " +  x.and(z))
}

fun Boolean_to_String() {

    val x: Boolean = true
    var z: String

    z = x.toString()

    println("x.toString() = " + x.toString())
    println("z = " + z)
}