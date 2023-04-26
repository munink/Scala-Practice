package com.string.operation

object Scala_String07 {
  def test(str1: String, end_str: String): Boolean = {
    str1.endsWith(end_str)
  }

  def main(args: Array[String]): Unit = {
    val str1 = "Python Exercises";
    val str2 = "Python Exercise";

    // The String to check the above two Strings to see
    // if they end with this value (se).
    val end_str = "se";

    // Check first two Strings end with end_str
    val ends1 = test(str1, end_str)
    val ends2 = test(str2, end_str)
    // Display the results of the endsWith calls.
    println("\"" + str1 + "\" ends with " +
      "\"" + end_str + "\"? " + ends1);
    println("\"" + str2 + "\" ends with " +
      "\"" + end_str + "\"? " + ends2);
  }
}
