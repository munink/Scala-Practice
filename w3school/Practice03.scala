package com.basic.w3school

object Practice03 {
  def main(args: Array[String]): Unit = {
    val doSomething = (x: Int, y: Int) => x * y
    val timesTen = doSomething(10, _: Int)
    // val timesTen = doSomething(10, _)  // Will work
    println(doSomething(10, 5))
    println(timesTen(8))
  }
}
