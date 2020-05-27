package lectures.part1basics

object DefaultArgs extends App
{
  def trFact(n: Int, acc: Int = 1): Int = // Assigning default value 1 to acc
  {
    if(n <= 1)
      1
    else
      trFact(n-1, n * acc)
  }

  val fact10 = trFact(10) // you can skip passing acc as default value is already set
  val fact9 = trFact(9, 2) // if you pass the parameter, it will override the default value

  def savePicture(format: String = "jpg", width: Int = 100, height: Int = 200): Unit = println("saving picture")

  savePicture() // without argument we can call the function, as default values are set for all the variables

  savePicture(width = 200, height = 50, format = "bmp") // if we specify the parameter name, we can pass it in any order

}
