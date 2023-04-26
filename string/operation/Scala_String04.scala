package com.string.operation

object Scala_String04 {
  def main(args: Array[String]): Unit = {
    val str1 = "Scala Exercises and ";
    val str2 = "Python Exercises";
    println("Original strings:")
    println("String 1: " + str1);
    println("String 2: " + str2);

    // Concatenate the two strings together.
    val str3 = str1.concat(str2);
    // Display the new String.
    println("The concatenated string: " + str3);
  }
}
