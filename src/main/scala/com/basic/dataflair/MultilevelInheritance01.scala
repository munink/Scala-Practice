package com.basic.dataflair

object MultilevelInheritance01 extends App {
  new C()
}

class A {
  println("A")
}

class B extends A {
  println("B")
}

class C extends B {
  println("C")
}