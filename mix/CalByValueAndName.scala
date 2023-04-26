package com.basic.mix

object CalByValueAndName {
  def main(args: Array[String]): Unit = {
    def showTime() = {
      System.nanoTime()
    }

    // Call by value
    def doIt(time: Long) = {
      println("Time: ")
      println(time)
      println("Time now: ")
      time
    }

    println(doIt(showTime()))
    println("=================")

    // Call by name
    def doThis(time: => Long) = {
      println("Time: ")
      println(time)
      println("Time now: ")
      time
    }

    println(doThis(showTime()))
  }
}
