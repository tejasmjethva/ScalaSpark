package lectures.part2oop

object OOBasic extends App
{
  val person = new Person("John", 24)

  println(person)

  //println(person.name) name is class parameter and not field

  println(person.age) // age is converted to field using val

  person.greet("Tejas")
  person.greet()
}

class Person(name: String, val age: Int) // constructor
{
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit =
  {
    println(s"${this.name} says: Hi, $name")
  }

  //overloading
  def greet(): Unit =
  {
    println(s"Hi, I am $name")
  }
}

//class parameters are not fields
//to convert parameters to fields add val or var for the parameter eg in case of age