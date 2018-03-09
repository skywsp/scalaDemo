package com.wsp.day01

object ConditionDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    val y = if(x>0) 1 else 2
    println(y)

    val z = if(x>0) 1 else "error"
    println(z)

    val m = if(x>2) 1
    println(m)

    val n = if(x>2) 1 else()
    println(n)

    val k = if(x<0) 0
    else if(x>=1) 1
    else -1
    println(k)

  }
}
