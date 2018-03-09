package com.wsp.day01

object HelloWord {
  def main(args: Array[String]): Unit = {
    println("hello wsps Scala!")
    println(abc())
    println(arr)
    val arr2 = arr.map(_*10)
    println(arr2.toBuffer)
  }

  def abc() : String ={
    val a = 3
    val b = 4
    a * b+"abc"
  }

  val arr = Array(1,2,3,4,5,6,7,8,9,10)
  var arr2 = arr.map(_*10)
  var arr3 = arr.filter(_%2!=0)
  println(arr.toString)
  println(arr2.toString)
  println(arr3.toString)
}
