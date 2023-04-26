package com.string.operation

object Scala_String08 {
  def test(str1: String, str2: String): Boolean = {
    str1.equals(str2)
  }

  def main(args: Array[String]): Unit = {
    val columnist1 = "Stephen Edwin King";
    val columnist2 = "Stephen Edwin  King";
    val columnist3 = "Stephen Edwin King";

    // Are any of the above Strings equal to one another?
    val equals1 = test(columnist1, columnist2)
    val equals2 = test(columnist1, columnist3)
    // Display the results of the equality checks.
    System.out.println("\"" + columnist1 + "\" equals \"" +
      columnist2 + "\"? " + equals1);
    System.out.println("\"" + columnist1 + "\" equals \"" +
      columnist3 + "\"? " + equals2);
  }
}
