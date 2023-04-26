package com.basic.mix

object FunctionComposition01 {
  def main(args: Array[String]): Unit = {
    val subTotal = (amt: Int) => {
      val cost: Double = .5
      cost * amt
    }
    val calcTax = (sub: Double) => {
      val tax = 1.1
      sub * tax
    }
    val total = (calcTax compose subTotal) (12)
    println(total)

    // val total1 = (calcTax compose subTotal)(12)
    // println(total1)

    val total2 = (subTotal andThen calcTax) (12)
    println(total2)
  }
}
