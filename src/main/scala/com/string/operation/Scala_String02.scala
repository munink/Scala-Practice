package com.string.operation

object Scala_String02 {
  def main(args: Array[String]): Unit = {
    val str = "w3resource - Scala";
    println(s"Original String : ${str}");
    // codepoint at index 1
    val val1 = str.codePointAt(1);
    // codepoint at index 12
    val val2 = str.codePointAt(9);
    // prints character at index1 in string
    println("Character(unicode point) = " + val1);
    // prints character at index9 in string
    println("Character(unicode point) = " + val2);
  }
}
