package com.basic.singleton

import com.basic.singleton.Logger.info

class Test {
  val project1 = new Project("Book writing", 365)
  val project2 = new Project("Revision", 30)
  info("Planned")
}
