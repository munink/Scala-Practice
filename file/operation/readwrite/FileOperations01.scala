package com.file.operation.readwrite

import scala.io.Source

object FileOperations01 extends App {

  import java.io._

  val writer = new PrintWriter(new File("demo1.txt"))
  writer.write("This is a demo!\nWriting file content!")
  writer.close()

  val file = Source.fromFile("demo1.txt").mkString
  println(file)

  println("========== Reading demo2.txt file ==========")
  Source.fromFile("demo2.txt").getLines.foreach { x => println(x) }

  println("============= next ==============")
  val it = Source.fromFile("demo2.txt").getLines()
  println(it.next())

  println("============= take ==============")
  val next = Source.fromFile("demo2.txt").getLines.take(2)
  while (next.hasNext) {
    println(next.next())
  }

  println("========== slice ===========")
  val slice = Source.fromFile("demo2.txt").getLines.slice(2, 3)
  while (slice.hasNext) {
    println(slice.next())
  }

}
