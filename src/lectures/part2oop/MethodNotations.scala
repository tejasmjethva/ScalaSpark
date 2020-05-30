package lectures.part2oop

object MethodNotations extends App
{
  class Person(val name: String, favoriteMovie: String, val age: Int = 0)
  {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangout(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(string1:String, string2:String): String = string1 + string2 //we can name method as operator name

    def unary_! : String = s"$name, what the heck?!!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    /*Exercise*/
    //1.
    def +(nickname: String): Person = new Person(s"$name $nickname", this.favoriteMovie)

    //2.
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    //3.
    def learns(language: String): String = s"$name is learning $language"

    def learnsScala(): String = learns("Scala")

    //4.
    def apply(numberOfTimes: Int): String = s"$name watched $favoriteMovie $numberOfTimes times"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // Equivalent, method names acts as an operator
  //infix notation = operator notation (syntactic sugar)

  //"operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangout tom)

  println(2 + 2)
  println(2.+(2))

  println("foo" + "bar")

  //ALL OPERATORS ARE METHODS

  //prefix notation
  val x = -1 //is equivalent to 1.unary_-
  val y = 1.unary_-
  //unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!) // is equivalent

  //postfix notation
  println(mary.isAlive) //it works with method without argument
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) //equivalent

  /*
    Exercise

    1. Overload + operator
       mary + "the rockstar" => new person "Mary {the rockstar}"
    2. Add an age to the Person class
       Add a unary + operator => new person with age + 1
       +mary => mary with the age incrementer
    3. Add a "learns" method in the Person class => "Mary learns Scala"
       Add a learnScala method , calls learns method with "Scala".
       Use it in postfix notation
    4. Overload the apply method
       mary.apply(2) => "Mary watched inception 2 times"
   */

  //1.
  println((mary + "the rockstar")())

  println((mary + "the charmer").apply())

  //2.
  println((+mary).age)

  //3.
  println(mary.learns("python"))
  println(mary learns "java")
  println(mary.learnsScala())

  //4.
  println(mary.apply(3))
}
