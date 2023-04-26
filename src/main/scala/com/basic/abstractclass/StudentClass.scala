package com.basic.abstractclass

class StudentClass (age:Int) extends PersonAbstract(age) {
  SSN="323-44-798"
  def greet(): Unit = {
    println("Hi, I'm a student")
    println("I am " + age + " years old")
    println("My social security number is " + SSN)
  }
}
