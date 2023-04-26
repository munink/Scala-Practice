package com.basic.collections

object MapTest extends App {
  var m1:Map[String, Int] = Map()
  var m2 = Map("Ayushi"->0, "Megha"->1)
  m2 += ("Ruchi"->2)

  println(m2.keys)
  println(m2("Megha"))
  println(m2.values)
  println(m2.isEmpty)
  println(Map().isEmpty)

  var m3 = Map("Megha"->3,"Ruchi"->2,"Becky"->4)
  println(m2++m3)
  m3.keys.foreach{i=>println(i+" "+m3(i))}
  println(m2.contains("Ayushi"))

  println(m2.++(m3))
  println(m2.-("Ayushi","Ruchi"))
  println(m2.get("Megha"))
  println(m2.get("Fluffy"))
  println(m2.apply("Ayushi"))
  //println(m2.apply("Fluffy"))
  println(m2.count(x=>true))
  println(m2.drop(2))
  println(m2.take(2))
  println(m2.tail)
  println(m2.mkString)

  //m2.reduce()
}
