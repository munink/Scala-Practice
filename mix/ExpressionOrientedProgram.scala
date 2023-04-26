package com.basic.mix

object ExpressionOrientedProgram {
  def main(args: Array[String]): Unit = {
    // Expression oriented programming (EOP)
    // Expressions, not statements
    // Example of a statement:
    // shoppingCart.checkOut()
    // Example of an expression
    // val shoppingCart = checkOut(items)
    val x = 10
    val y = 20
    val check = if (x > y) "true" else "false"
    println(check)
  }
}
