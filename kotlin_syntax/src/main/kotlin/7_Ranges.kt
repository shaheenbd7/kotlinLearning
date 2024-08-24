import kotlin.reflect.typeOf

fun main() {

    println("--------------------------")
    for(num in 1.rangeTo(7)) {
        print(num)
        print(",")
    }
    println()
    println("--------------------------")
    for(num in 1..5) {
        print(num)
        print(",")
    }
    println()
    println("--------------------------")

    for(num in 5 downTo 1) {
        print(num)
        print(",")
    }
    println()
    println("--------------------------")

    for(num in 1..5 step 2) {
        print(num)
        print(",")
    }
    println()
    println("--------------------------")

    for(ch in 'a'..'z') {
        print(ch)
        print(",")
    }
    println()
    println("--------------------------")

    for(num in (1..5).reversed()) {
        print(num)
        print(",")
    }
    println()
    println("--------------------------")


    for(num in 1 until 5) {
        print(num)
        print(",")
    }
    println()
    println("--------------------------")

    println((5..10).first)
    println((5..10 step 2).step)
    println((5..10).reversed().last)

//    Filtering range

    val a = 1..10
    val f = a.filter { T-> T % 2 == 0 }

    println(f)
//  Range Utility Functions
    println(a.min())
    println(a.max())
    println(a.sum())
    println(a.average())
    println(a.count())


}