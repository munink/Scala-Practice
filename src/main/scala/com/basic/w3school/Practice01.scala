package com.basic.w3school

object Practice01 {
  def main(args: Array[String]): Unit = {
    val multiply = (x: Int, y: Int) => x * y
    println(multiply(2, 6))

    val z = multiply(5, 6)
    println(z)
  }
}
