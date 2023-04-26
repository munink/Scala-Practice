package com.basic.dataflair

object MultipleInheritance01 {
  def main(args: Array[String]):Unit={
    trait A{
      var length:Int= _
      def action()={
        length=length+5
      }
    }
    trait B{
      var height:Int = _
      def action()={
        height = height + 1
      }
    }
    class C extends A with B{
      //length = 4;
      //height += 6;
      override def action={
        super[A].action
        super[B].action
      }
    }
    var c = new C
    c.action()
    println(c.length)
    println(c.height)
  }
}
