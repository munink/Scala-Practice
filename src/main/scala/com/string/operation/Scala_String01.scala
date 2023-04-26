package com.string.operation

object Scala_String01 {
  def main(args: Array[String]): Unit = {
    var str = "Scala Exercises!"
    println("Original String = " + str)
    // Get the character at positions 0 and 10.
    val index1 = str.charAt(0)
    val index2 = str.charAt(10)
    val index3 = str.charAt(15)

    // Print out the results
    println(s"The character at position 0 is ${index1}");
    println(s"The character at position 10 is ${index2}");
    println(s"The character at position 15 is ${index3}");
    println(s"Length of the string: ${str.length}")
  }
}
