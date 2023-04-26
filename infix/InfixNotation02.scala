package com.basic.infix

object InfixNotation02 extends App {
  val honda = new Vehicle("Honda CRV")
  honda calcAvgSpeed (200, 3)
}

class Vehicle(vehicleName: String) {
  var name: String = vehicleName
  var avgSpeed: Int = 0

  def calcAvgSpeed(distance: Int, time: Int): Unit = {
    avgSpeed = distance / time
    println("The " + name + " had an average speed of " + avgSpeed + " mph.")
  }
}
