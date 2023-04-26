package com.basic.mix

object LazyVal01 extends App {

  val x = {
    println("foo"); 10
  }
  println("bar")
  println(x)

  println("=======================")

  lazy val l = {
    println("foo");
    10
  }
  println("bar")
  println(l)
}
