package com.basic.mix

object TypedPatternPractice01 {
  def main(args: Array[String]): Unit = {
    def fn(a: Any): String = a match {
      case _: Char => "Char"
      case _: Int | _: Long | _: Short => "Integer Value"
      case _: Double | _: Float => "Floating point number"
      case _: String => "String"
      case _ => "N/A"
    }

    println(fn(1)) // Int
    println(fn(1L)) // Long
    println(fn(1: Short)) // Short
    println(fn('a')) // Char
    println(fn(true)) // N/A
    println(fn(1.0d)) // double
    println(fn(1.0f)) // float
  }
}
