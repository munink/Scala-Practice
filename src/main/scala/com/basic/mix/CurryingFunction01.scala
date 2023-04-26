package com.basic.mix

object CurryingFunction01 {
  def main(args: Array[String]): Unit = {
    // def multiply(a: Int)(b: Int) = a * b
    def multiply(a: Int) = (b: Int) => a * b

    println(multiply(5)(15))
    println(multiply(5))
  }
}
