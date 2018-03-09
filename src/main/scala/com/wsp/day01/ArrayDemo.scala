package com.wsp.day01

import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val arr1 = new Array[Int](8)
    println(arr1.toBuffer)
    val arr2 = Array[Int](9)
    println(arr2.toBuffer)

    val arr3=Array("hadoop", "storm", "spark")
    println(arr3.toBuffer)
    println(arr3(1))

    val ab = ArrayBuffer[Int]()
    ab += 1
    println(ab)
    ab +=(2,3,4)
    println(ab)
    ab ++= Array(5,6)
    println(ab)
    ab ++= ArrayBuffer(7,8,9)
    println(ab)
  }
}



















