package com.basic.mix

object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    println((x: Int, y: Int) => x * y)

    // println("Value: " + println(10, 20))
  }
}
