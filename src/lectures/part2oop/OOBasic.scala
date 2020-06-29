package lectures.part2oop

object OOBasic extends App
{
  val person = new Person("John", 24)

  println(person)

  //println(person.name) name is class parameter and not field

  println(person.age) // age is converted to field using val

  person.greet("Tejas")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

//class parameters are not fields
//to convert parameters ro fields add val or var for the parameter eg in case of age
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

/*
  Novel and a Writer

  Writer: first name, last name, year
    - method fullname

   Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) - new instance of Novel
 */
class Writer(firstName: String, lastName: String, val year: Int)
{
  def fullName: String = firstName + " " + lastName
}

class Novel(name: String, year: Int, author: Writer)
{
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, year, author)
}

/*
  Counter class
    - Receives an int value
    - Method current count
    - Method to increment/decrement -> new Counter
    - Overload inv/dev method to receive an amount
 */
class Counter(val count: Int = 0)
{
  def inc =
  {
      println("incrementing")
      new Counter(count + 1) //immutability
  }

  def dec =
  {
    println("decrementing")
    new Counter(count - 1) //immutability
  }

  def inc(n: Int): Counter =
  {
    if (n <= 0)
      this
    else
      inc.inc(n-1)
  }

  def dec(n: Int): Counter =
  {
    if (n <= 0)
      this
    else
      dec.dec(n-1)
  }

  def print = println(count)
}
