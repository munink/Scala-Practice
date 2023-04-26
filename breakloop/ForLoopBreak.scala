package com.basic.breakloop

import scala.util.control.Breaks

object ForLoopBreak extends App {
  val loop = new Breaks
  val nums = List(1,2,3,4,5)
  var a = 0
  loop.breakable
  {
    for(a<-nums)
    {
      println(a)
      if(a==3)
      {
        loop.break
      }
    }
  }
}
