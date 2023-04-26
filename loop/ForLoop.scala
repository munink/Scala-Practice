package com.basic.loop

object ForLoop extends App {
  var a=7
  println("=============== Normal for loop ===================")
  for(a<-1 to 10)
  {
    print(a + " -> ")
  }
  println()
  println("=============== Until for loop ====================")
  a = 0
  for (a <- 1 until 10) {
    print(a + " -> ")
  }
  println()
  println("=============== Multiple Ranges for loop ====================")
  a=0
  var b=0
  var c=0
  for(a<-1 until 3; b<-7 to 9; c<-12 until 15)
  {
    println()
    println(a)
    println(b)
    println(c)
  }
  //println()
  println("=============== Using Collections ====================")
  a = 0
  val odds = List(1, 3, 5, 7, 9)
  for (a <- odds) {
    println(a)
  }
  println()
  println("=============== Using Filters ====================")
  a = 0
  val nums = List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
  for (a <- nums
       if a > 3;
       if a < 15) {
    println(a)
  }
  println()
  println("=============== loop Yield ====================")
  a = 0
  val values = List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
  var ret = for {a <- values
                 if a > 3; if a < 15} yield a
  for (a <- ret) {
    println(a)
  }
}
