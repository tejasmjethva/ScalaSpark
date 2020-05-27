package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App
{
  def factorial(n: Int) : Int =
  {
    if(n <= 1)
      1
    else
    {
      println("Computing factorial of " + n + " - first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt =
  {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
    {
      if (x <= 1)
        accumulator
      else
        factorialHelper(x - 1, x * accumulator) // TAIL RECURSION
    }
    factorialHelper(n, 1)
  }

    /*
   * anotherFactorial(10) = factorialHelper(10, 1)
   * = factorialHelper(9, 10 * 1)
   * = factorialHelper(9, 9 * 10 * 1)
   * = factorialHelper(9, 8 * 9 * 10 * 1)
   * ...
   * = factorialHelper(9, 1 * 2 * 3 * 4 *......10 * 1)
   * = 1 * 2 * 3 * 4 *......10 * 1
   *
   */

  println(anotherFactorial(20000))

  //When you need loops, use Tail Recursion

  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
  {
    if(n <= 0)
      accumulator
    else
      concatenateTailRec(aString, n-1, aString + accumulator)
  }

  println(concatenateTailRec("hello", 3, ""))

  def isPrime(n: Int): Boolean =
  {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
    {
      if(!isStillPrime)
        false
      else if(t <= 1)
        true
      else
        isPrimeTailRec(t-1, (n % t) != 0 && isStillPrime)
    }

    isPrimeTailRec(n/2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int =
  {
    def fibonacciTailRec(i: Int, last: Int, nextToLast: Int): Int =
    {
      if(i >= n)
        last
      else
        fibonacciTailRec(i + 1, last + nextToLast, last)
    }

    if(n <= 2)
      1
    else
      fibonacciTailRec(2, 1, 1)
  }

  println(fibonacci(8)) // 1 1 2 3 5 8 13 21
}
