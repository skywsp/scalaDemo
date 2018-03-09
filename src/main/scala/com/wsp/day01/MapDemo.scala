package com.wsp.day01

object MapDemo {
  def main(args: Array[String]): Unit = {
    var scors1 = Map("tom" -> 85, "lili"->73, "jerry" -> 21)
    val scors2 = Map(("bluz",45),("nacy",79),("kack",12))
    println(scors1)
    println(scors2)
    println(scors1("tom"))
    // 查
    println(scors1.getOrElse("jamz",88))
    // 增
    scors1 += ("jamz"->66)
    scors1 += (("phria",55))
    // immutable包下的Map不可改
    // scors1("jamz") = 77
    println(scors1)
  }
}
