package com.basic.overridemethodfield

class Vehicle {
  // Only val cab be overridden
  val wheels = 0
  // Cannot be overridden
  var tyres = 0
  tyres = 99
}

class Car extends Vehicle {
  override val wheels = 4
  // override var tyres = 4

  def show(): Unit = {
    println("The car has " + wheels + " wheels")
  }
}
