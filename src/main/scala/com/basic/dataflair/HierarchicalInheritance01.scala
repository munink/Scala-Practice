package com.basic.dataflair

object HierarchicalInheritance01 extends App {
  new B1
  println("=============")
  new C1()
}

class A1 {
  println("A")
}

class B1 extends A1 {
  println("B")
}

class C1 extends A1 {
  println("C")
}