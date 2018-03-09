package com.wsp.day02

object ApplyDemo {
  def apply(): Unit ={
    println("apply invok")
  }

  def apply(name : String): Unit ={
    println("name="+name)
  }

  def apply(age : Int): Unit ={
    println(age)
  }

  def main(args: Array[String]): Unit = {
    val a1 = ApplyDemo
    val a2 = ApplyDemo()
    val a3 = ApplyDemo("tom")
    val a4 = ApplyDemo(12)
  }


}
