package com.basic.mix

object FunctionDefinition01 extends App {

  def functionName1(x: Int, y: Int): Int = x + y

  def functionName2(x: Int, y: Int): Int = {
    return x + y
  }

  //def functionName3(x:Int,y:Int):Int{x+y} ()
  def functionName4(x: Int, y: Int) = {
    x + y
  }

  def func(arg: String*) = arg.mkString(", ")
}
