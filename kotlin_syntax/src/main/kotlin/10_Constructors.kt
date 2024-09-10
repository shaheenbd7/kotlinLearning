//------------------------------------------------
//              Constructors
//------------------------------------------------

/*

// class Person constructor(val firstName: String, val age: Int)

class Person(val _name: String, val _age: Int=20) {
    var name: String
    var age: Int

    init{
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

fun main() {
    val person = Person("abul", 20)
    val person_2 = Person("zara", 22)
}
*/


/*
* class Person{
   // Member Variables
   var name: String
   var age: Int

   // Initializer Block
   init {
      println("Initializer Block")
   }

   // Secondary Constructor
   constructor ( _name: String, _age: Int) {
      this.name = _name
      this.age = _age
      println("Name = $name")
      println("Age = $age")
   }
}

fun main(args: Array<String>) {
   val zara = Person("Zara", 20)
}
*
* */

class Person{
    // Member Variables
    var name: String
    var age: Int
    var salary:Double

    init{
        println("I am in init")
    }

    // First Secondary Constructor
    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
    }

    // Second Secondary Constructor
    constructor ( _name: String, _age: Int, _salary: Double) {
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}

fun main(args: Array<String>) {
    val nuha = Person("Nuha", 12)
    val zara = Person("Zara", 20, 2000.00)
}