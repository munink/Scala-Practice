package com.basic.companion

//Object name should be CompanionClass
object CompanionObject {
  def main(args: Array[String]): Unit = {
    new CompanionClass().greet()
    println("Companion object")
  }
}
