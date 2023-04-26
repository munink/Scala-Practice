package com.basic.mix

object IteratorsPractice01 {
  def main(args: Array[String]) {
    val worlds = Iterator("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
    println(worlds)

    while (worlds.hasNext) {
      print(worlds.next() + " ")
    }
  }
}
