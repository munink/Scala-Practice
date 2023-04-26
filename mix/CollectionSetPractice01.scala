package com.basic.mix

object CollectionSetPractice01 {
  def main(args: Array[String]): Unit = {
    val words = Set("the", "quick", "brown", "fox", "the")
    println(words.head)
    println(words.tail)
    println(words.isEmpty)
    println(words.min)
    println(words.max)

    val words1 = Set("the", "quick", "brown", "fox", "the")
    val words2 = Set("jumped", "over", "the", "lazy")
    var sentence1 = words1 ++ (words2)
    var sentence2 = words1.++(words2)
    println(sentence1)
    println(sentence2)
  }
}
