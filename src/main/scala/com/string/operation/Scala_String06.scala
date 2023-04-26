package com.string.operation

object Scala_String06 {
  def main(args: Array[String]): Unit = {
    // Character array with data.
    val arr_num = Array('1', '2', '3', '4', '5', '6');

    // Create a String containing the contents of arr_num
    // starting at index 1 for length 2.
    val str = String.copyValueOf(arr_num, 2, 3);

    // Display the results of the new String.
    println("\nThe book contains " + str + " pages.\n");
  }
}
