package com.basic.overridemethodfield

class Person {
  def greet(): Unit = {
    println("I'm a person")
  }
}

class Student extends Person {
  override def greet(): Unit = {
    println("I'm a student")
  }
}