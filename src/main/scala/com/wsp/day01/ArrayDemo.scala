package com.wsp.day01

import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var arr1 = new Array[Int](8)
    println(arr1.toBuffer)

    var arr2 = Array[Int](10)
    println(arr2.toBuffer)

    var arr3 = Array("hadoop","storm","spark")
    println(arr3(2))

    // 变长数组
    val ab = ArrayBuffer[Int]()
    ab += 1
    ab += (2,3)
    // 用 ++=
    ab ++= Array(4,5,6)
    ab ++= ArrayBuffer(7,8)
    ab.insert(0,-2,-1)
    println(ab)
    ab.remove(5,3)
    println("从第5个开始，删除3个：")
    println(ab)


  }
}
