package com.basic.mix

object EqualityTest01 {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 15
    if (a == b)
      println("equals")
    else println("not equal")

    if (a != b)
      println("equals")
    else println("not equal")
  }
}
