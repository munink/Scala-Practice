package com.basic.w3school

object scala_basic21 {
  def test(str1: String): Boolean = {
    val count_char = str1.count { n => n == 'z' }
    count_char >= 2 && count_char <= 4
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("frizz"));
    println("Result: " + test("zane"));
    println("Result: " + test("Zazz"));
    println("Result: " + test("false"));
  }
}
