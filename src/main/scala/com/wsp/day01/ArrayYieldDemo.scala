package com.wsp.day01

object ArrayYieldDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5,6)

    val arr2 = for(i <- arr) yield  i * 2

    val arr3 = arr.map(_ * 3)

    println(arr.toBuffer)
    println(arr2.toBuffer)
    println(arr3.toBuffer)

    val arr4 = for(i <- arr if(i%2==0)) yield i*10
    val arr5 = arr.filter(_%2==0).map(_*4)
    println(arr4.toBuffer)
    println(arr5.toBuffer)

    val newArr = Array(4,5,1,6,2,6,2,9)
    println(newArr.max)
    println(newArr.min)
    println(newArr.sorted.toBuffer)
    println(newArr.sorted.reverse.toBuffer)
    println(newArr.sum)
  }
}
