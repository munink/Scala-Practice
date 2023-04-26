package com.basic.tuples

/* *
   A tuple is a Scala collection which can hold multiple values of same
   or different type together so they can be passed around as a whole.
   Unlike an array or list, a tuple can hold objects with different types
   but they are also immutable.
  */

object TuplesToString extends App {
  val t1 = new Tuple3(1, "hello", 20.2356)
  val t2 = (1, "hello", 20.2356)
  1 -> "a"
  2 -> ("a", "b")

  val t3 = (4,3,2,1)
  val sum = t3._1 + t3._2 + t3._3 + t3._4
  println("Sum of elements: " + sum )
  t3.productIterator.foreach{ i => println("Value = " + i )}

  val t4 = new Tuple2("tuple", "test")
  println("Swapped Tuple: " + t4.swap )

  val t5 = (1, "hello", 20.2356)
  println("Concatenated String: " + t5.toString() )
}
