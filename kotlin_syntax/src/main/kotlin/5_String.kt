import java.util.*

fun main() {

    Game_With_String()
//    Raw_Escaped()
//    assignment()
}

fun Game_With_String() {
    val name : String = "Zara Ali"
    val lastName: String = " Khan"

    println("Upper case of name :" + name.uppercase(Locale.getDefault()))
    println("Lower case of name :" + name.lowercase(Locale.getDefault()))

    println(name.length)
    println(name[3])
    println(name.count())
    println(name.lastIndex)

    println("Full Name: " + (name + lastName) )
    println("Full Name :" + name.plus(lastName) )

    println("Remove first two characters from name : " + name.drop(2))
    println("Remove last two characters from name : " + name.dropLast(2))

    val str1 : String = "That's it"
    val str2 : String = "It's OK"

    println("str1 : " + str1)
    println("str2 : " + str2)

    var str : String = "Meditation and Yoga are synonymous with India"
    println("Index of Yoga in the string - " + str.indexOf("Yoga"))

    val str3: String = "Apple"
    val str4: String = "Apple"

    println( str3.compareTo(str4) )

    var name2 : String = "Zara"

    println(name2.getOrNull(0))
    println(name2.getOrNull(2))
    println(name2.getOrNull(100))
}


fun Raw_Escaped() {
    val escapedString : String  = "I am escaped String!\n"
    var rawString :String  = """This is going to be a
   multi-line string and will
   not have any escape sequence""";

    print(escapedString)
    println(rawString)

    println(escapedString.length)
    println(escapedString[3])
    println(escapedString.count())
    println(escapedString.lastIndex)
}

fun assignment() {
    val name: String
    name = "biral"
    println("$name")
}
