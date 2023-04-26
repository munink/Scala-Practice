package com.function.exception

import java.io.{File, PrintWriter}

object ExceptionHandling06 extends App {
  @throws(classOf[NumberFormatException])
  def validateit() = {
    "abcd".toInt
  }

  //@throws[IOException]("if the file doesn't exist")
  //def read() = in.read()

  validateit()

  val writer = new PrintWriter(new File("demo1.txt"))
}
