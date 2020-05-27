package lectures.part1basics

object Expressions extends App
{
  val x = 1 + 2 //expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(1 != x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  //Instructions (DO) vs expressions (VALUE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  //Everything in scala is expression
  val aWeirdValue = (aVariable = 3) // Unit  === void
  println(aWeirdValue)

  // Side effects: results in returning of Unit - println(), whiles, reassigning

  //Code blocks
  val aCodeBlock =
  {
    val y = 2
    val z = y + 1

    if(z > 2) "Hello" else "good bye"
  }

  println(aCodeBlock)
}
