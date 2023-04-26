package com.basic.caseclass

object SongObject extends App {
  var stay = Song("Stay","Inna",4)

  println(stay.title)
  //stay.title="Me Gusta"

  val crybaby = Song("Cry Baby","Melanie Martinez",7)
  val cry_baby = Song("Cry Baby","Melanie Martinez",7)
  println(crybaby == cry_baby)

  // Shallow-Copying a Scala Case Class
  val obj1 = crybaby.copy()
  val obj2 = crybaby.copy(title = crybaby.title, artist = "Sia")
  println(obj1 == obj2)
}
