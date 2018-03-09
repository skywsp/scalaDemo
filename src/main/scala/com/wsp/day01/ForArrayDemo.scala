package com.wsp.day01

object ForArrayDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array.apply(1,2,3,4,5,6,7,8,9)
    println(arr.toBuffer)

    for(i <- arr) print(i)
    println()
    for(i <- (0 until arr.length))print(arr(i)+",")
    println()
    for(i <- (0 until(arr.length)).reverse) print(arr(i)+",")
    println()
  }
}
