package com.basic.function

/*
  Tail recursion:
  The very last function call is the recursive function itself.
* */
object TailRecursion extends App {
  def resurse(total: Int, counter: Int): Int = {
    if(counter == 1)
      return total
      resurse(counter * total, counter - 1)
  }
  println(resurse(1, 5))
}
