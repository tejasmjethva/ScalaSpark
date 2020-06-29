package lectures.part2oop

object Objects extends App
{
  //SCALA doesn't have class level functionality ("static")
  object Person
  {
    //Class level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String)
  {
    //Instance level functionality
  }

  //Class and Object of same name in same scope are called as companions

  println(Person.N_EYES)
  println(Person.canFly)

  //SCALA object - singleton instance
  val mary = Person
  val john = Person

  println(mary == john)

  //This will have 2 different instances
  val mariam = new Person("Mariam")
  val jack = new Person("Jack")

  println(mariam == jack)

  val bobbie = Person.apply(mariam, jack)
  //Or
  val bobbie1 = Person(mariam, jack) // looks like constructor but it actually calls apply method
}
