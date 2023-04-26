package com.basic.w3school

object scala_basic16 {
  def test(str: String): String = {
    if (str.drop(1).startsWith("yt")) str.replaceFirst("yt", "")
    else str
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + test("Scala"))
    println("Result: " + test("yytade"))
    println("Result: " + test("ytsues"))
  }
}
