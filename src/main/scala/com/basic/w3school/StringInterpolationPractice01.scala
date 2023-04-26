package com.basic.w3school

object StringInterpolationPractice01 {
  def main(args: Array[String]): Unit = {
    val fn = "Cody"
    val ln = "Blackwell"
    val age = 30
    val home = "Ireland"
    println(s"$fn $ln is $age years old, and lives in $home.")
    println(s"$fn's age next year will be ${age + 1}")
    println(s"$fn's age is 23: ${age == 23}")
  }
}
