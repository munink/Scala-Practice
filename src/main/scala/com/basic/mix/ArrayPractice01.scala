package com.basic.mix

object ArrayPractice01 {
  def main(args: Array[String]): Unit = {
    // Arrays are immutable, can't add or remove elements and structure
    // only can be changed the existing elements
    // For mutable array, we can use ArrayBuffer
    new Array[String](3)
    val arr: Array[String] = new Array[String](3)
    val fruit = Array("apple", "orange", "banana")
    println(fruit.length)
    println(fruit(1))
    fruit(1) = "grape"
    println(fruit(1))
  }
}
