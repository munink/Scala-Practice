package com.basic.mix

object program {
  def main(args: Array[String]): Unit = {
    def addI(i: Int, j: Int): Int = {
      var sum: Int = 0
      sum = i + j
      return sum
    }

    println("Returned value: " + addI(1, 9))
  }
}
