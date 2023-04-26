package com.basic.singleton

object SingletonObject extends App {
  def greet(): Unit = {
    println("Hello!")
  }

  SingletonObject.greet()
}
