package lectures.part1basics

object StringOps extends App
{
  val str: String = "Hello, I am learning scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //Scala specific functions: String interpolator

  //S - interpolator
  val name = "Tejas"
  val age = 29
  val greeting = s"Hello, I am $name and I am $age years old"
  println(greeting)

  //F - interpolator
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burger in a minute"
  println(myth)

  //raw - interpolator
  println(raw"This is a \n newline") // character is not escaped, it will be printed
  val escaped = "This is a \n newline"
  println(raw"$escaped") // in this case it will be escaped
}
