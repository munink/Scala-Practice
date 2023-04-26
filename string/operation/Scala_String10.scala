package com.string.operation

object Scala_String10 {
  def removeDuplicateChars(s: String): String = {
    //val arr1 = s.toCharArray();
    var targetStr = "";
    for (value <- s) {
      if (targetStr.indexOf(value) == -1) {
        targetStr += value;
      }
    }
    //return targetStr;
    targetStr
  }

  def main(args: Array[String]): Unit = {
    var str1 = "w3resource";
    println("The given string is: " + str1);
    System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1)
    );
    str1 = "Scala";
    println("The given string is: " + str1);
    System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1)
    );
    str1 = "2q34u923u4928402";
    println("The given string is: " + str1);
    System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1)
    );
  }
}
