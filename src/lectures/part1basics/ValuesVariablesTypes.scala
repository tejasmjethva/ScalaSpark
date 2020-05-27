package lectures.part1basics

object ValuesVariablesTypes extends App
{
  //Val - Immutable
  val x = 42 // type is not necessary, it is inferred by scala
  println(x)

  val asString: String = "This is a String"
  val asBoolean: Boolean = false
  val asChar: Char = 'A'
  val asInt: Int = 10
  val asShort: Short = 343
  val asLong: Long = 212121121212112L
  val asFloat: Float = 2.33f
  val asDouble: Double = 22.3333

  //Var
  var aVariable = "test"
  aVariable = "newTest" // can reassigned
}
