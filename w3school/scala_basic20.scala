package com.basic.w3school

object scala_basic20 {
  def test(x: Int, y: Int): Int = {
    val max_of_two = List(x, y).max
    if (max_of_two >= 20 && max_of_two <= 30) max_of_two else 0
    //val is_both_in_range = List(x, y).forall(n => n >=20 && n <= 30)
    //val is_one_in_range = List(x, y).forall(n => n >=20 && n <= 30)
    //if (is_both_in_range) Math.max(x, y)
    //else if ()
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test(78, 95));
    println("Result: " + test(20, 30));
    println("Result: " + test(21, 25));
    println("Result: " + test(28, 28));
    println("Result: " + test(28, 82));
  }
}
