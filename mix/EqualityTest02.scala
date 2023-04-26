package com.basic.mix

object EqualityTest02 {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 10
    var c = 15

    if (a == b && a == c)
      println("Everything's equal")
    else
      println("nope")
  }
}
