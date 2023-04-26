package com.string.operation

object Scala_String05 {
  def test(str1: String, str2: String): Boolean = {
    str1.contains(str2)
  }

  def main(args: Array[String]): Unit = {
    var str1 = "Scala Exercises and Python Exercises";
    var str2 = "and";
    println("Original String: " + str1);
    println("Specified sequence of char values: " + str2);
    println("Test if the said string contains the specified sequence of char values!")
    println(test(str1, str2))
    str1 = "Scala Exercises and PHP Exercises";
    str2 = "Python";
    println("Original String: " + str1);
    println("Specified sequence of char values: " + str2);
    println("Test if the said string contains the specified sequence of char values!")
    println(test(str1, str2))
  }
}
