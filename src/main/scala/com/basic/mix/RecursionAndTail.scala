package com.basic.mix

object RecursionAndTail {
  def main(args: Array[String]): Unit = {
    /**
     * Recursion:
     * 5 * count(5-1)
     * 4 * count(4-1) = 20
     * 3 * count(3-1) = 60
     * 2 * count(2-1) = 120
     * 1 - recursion done, return
     */
    def recurse(counter: Int): Int = {
      if (counter == 1)
        return 1
      counter * recurse(counter - 1)
    }

    println(recurse(5))

    // Tail recursion
    def tailRecurse(total: Int, counter: Int): Int = {
      if (counter == 1)
        return total
      tailRecurse(counter * total, counter - 1)
    }

    println(tailRecurse(1, 5))
  }
}
