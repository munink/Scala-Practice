package com.basic.mix

object Exercise01 {
  def main(args: Array[String]): Unit = {
    /* Create pure function */
    var x = 5
    var y = 10
    var pure = x + y
    println(pure)

    /* Compose two functions */
    val cost = (cst: Int) => {
      cst
    }
    val amount = (amt: Int) => {
      amt * 10
    }
    val total = (amount compose cost) (5)
    println(total)

    /* Use maps */
    val groceries = Map("eggs" -> "$1.75", "bread" -> "$2.00", "milk" -> "$3.60")
    println(groceries.keys)
    println(groceries.values)
    println(groceries("milk"))

    /* Compare strings for equality */
    var str1: String = new String("hello")
    var str2: String = "hello"
    if (str1 != str2)
      println("Not equal")
    else
      println("equals")
  }
}
