package com.basic.mix

object Zip01 extends App {
  val zip1 = List(1, 2, 3, 4, 5)
  val zip2 = List(6, 7, 8, 9)
  val zip3 = List("axx", "bss", "caaa", "dee", "euu")

  val finalZip = zip1 zip zip2
  val finalZip1 = zip1 zip zip3
  println(finalZip)
  println(finalZip1)
}
