
fun main() {
    val a: Int  = 1000
    val d: Double = 100.0
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1


    println("Int value is: " + a)
    println("Double value is: " + d)
    println("Float value is: " + f)
    println("Long value is: " + l)
    println("Short value is: " + s)
    println("Byte value is: " + b)

    val letter: Char
    letter = 'A' // if you remove this line it produce this error: Variable 'letter' must be initialized
    println("Letter $letter")

    println("-------")
    println('\n') //prints a newline character
    println("-------")
    println('\$') //prints a dollar $ character
    println("-------")
    println('\\') //prints a back slash \ character
//    The following escape sequences are supported in Kotlin: \t, \b, \n, \r, \', \", \\ and \$.
    val escapedString : String  = "I am escaped String!\n"
    var rawString :String  = """This is going to be a
multi-line string and will
   not have any escape sequence""";

    print(escapedString)
    println(rawString)

    val A_bool: Boolean = true   // defining a variable with true value
    val B_bool: Boolean = false   // defining a variable with false value

    println("Value of variable A "+ A_bool )
    println("Value of variable B "+ B_bool )

    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Value at 3rd position : " + numbers[2])

//    val x_dt: Int = 100
//    val y_dt: Long = x_dt
    val x_a: Int = 100
    val y_a: Long = x_a.toLong()
    println(y_a)

}