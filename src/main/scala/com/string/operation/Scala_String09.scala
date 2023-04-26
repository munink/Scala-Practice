package com.string.operation

object Scala_String09 {
  def main(args: Array[String]): Unit = {
    var str = "The quick brown fox jumps over the lazy dog.";

    // Get a substring of the above string starting from
    // index 10 and ending at index 26.
    val new_str = str.substring(10, 25);

    // Display the two strings for comparison.
    println("Original = " + str);
    println("From said string, substring between two positions (10,25) = " + new_str);

  }
}
