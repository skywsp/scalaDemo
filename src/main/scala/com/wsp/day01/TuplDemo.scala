package com.wsp.day01

object TuplDemo {
  def main(args: Array[String]): Unit = {
    val t = (1,2.1,'a', "bc")
    println(t._1)
    println(t._3)

    val t1 = Array(("a",1),("b",2),("c",3))
    var m = t1.toMap
    println(m)

    val t2 = Array(4,5,6)
    val t3 = Array("d","e","f")
    val t4 = t3.zip(t2)
    println(t4.toBuffer)
  }
}
