package com.basic.mix

object MapTesto1 extends App {
  val map = Map("a" -> 1, "b" -> "x", "c" -> 3, "d" -> 4, 5 -> "e")
  println(map)
  println(map("a"))
  println(map(5))
  try {
    println(map("x"))
  } /* catch  {
    println("NoSuchElementException..")
  }*/
}
