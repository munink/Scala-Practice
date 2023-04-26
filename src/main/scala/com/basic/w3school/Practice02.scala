package com.basic.w3school

object Practice02 {
  def main(args: Array[String]): Unit = {
    val b: Int = 8
    val doIt = (a: Int) => a + b
    println(doIt(10))
  }
}
