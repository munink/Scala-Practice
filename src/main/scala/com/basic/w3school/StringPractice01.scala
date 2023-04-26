package com.basic.w3school

object StringPractice01 {
  def main(args: Array[String]): Unit = {
    var sayit: String = "hello world"
    println(sayit)
    println(sayit.length)

    var sayit1: String = "hello"
    var sayit2: String = "world"
    var sayit3: String = sayit1 + " " + sayit2
    println(sayit3)
    println(sayit3.length)
  }
}
