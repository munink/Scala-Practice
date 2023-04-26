package com.basic.mix

object MutableCollectionPractice01 {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable

    val arrayBuffer = mutable.ArrayBuffer(10, 20, 30, 40, 50)
    val listBuffer = mutable.ListBuffer("the", "quick", "brown")
    val hashSet = mutable.Set(100, 200, 300, 400, 500)
    val hashMap = mutable.Map("apple" -> .75, "orange" -> .80)
  }
}
