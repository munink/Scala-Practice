package com.basic.w3school

object scala_basic19 {
  def test(x: Int, y: Int): Boolean = {
    (List(x, y).forall(m => m >= 40 && m <= 50)
      || List(x, y).forall { n => n >= 50 && n <= 60 })
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(78, 95));
    println("Result: " + test(25, 35));
    println("Result: " + test(40, 50));
    println("Result: " + test(55, 60));
  }
}
