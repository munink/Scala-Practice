package com.basic.breakloop

import scala.util.control.Breaks

object ForLoopBreak01 extends App {
  val inner=new Breaks
  val outer=new Breaks
  val nums1=List(1,2,3,4)
  val nums2=List(5,6,7,8)
  var a=0
  var b=0
  outer.breakable
  {
    for(a<-nums1)
    {
      println(a)
      inner.breakable
      {
        for(b<-nums2)
        {
          println(b)
          if(b==7)
          {
            inner.break
          }
        }
      }
      if(a==3)
      {
        outer.break
      }
    }
  }
}
