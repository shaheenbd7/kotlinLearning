//class MyClass {
//    private var name: String = "shan"
//
//    fun printme() {
//        println("My name is $name")
//    }
//}
//
//fun main() {
//    val obj = MyClass()
//    obj.printme()
//}



//class Outer {
//    class Nested{
//        fun foo() = "Welcome to My Home"
//    }
//}
//
//fun main(args: Array<String>) {
//    val obj = Outer.Nested()
//    print(obj.foo())
//}


// Anonymous Inner Class

//interface Human {
//    fun think()
//}
//
//fun main() {
//    var programmer: Human = object : Human {
//        override fun think() {
////            TODO("Not yet implemented")
//            println("I am an example of annonymous inner class")
//        }
//    }
//    programmer.think()
//}

//------------------------------------------------
//              Kotlin Type Aliases
//------------------------------------------------

/*
typealias User = Triple<String, String, Int>

fun userInfo():User {
    return Triple("A", "B", 21)
}

fun main() {
    val obj = userInfo()
    println(obj)
}
*/