package com.basic.w3school

object scala_basic04 {

  def test(str: String): String = {
    if (str.startsWith("if")) str else "if " + str
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("if else"))
    println("Result: " + test("else"))
  }
}
