package com.wsp.day01

object BlockExpressionDemo {
  def main(args:Array[String]): Unit ={
    val x = 0;
    val result = {
      if(x<0) -1
      else if(x >=1) 1
      else "error"
    }
    println(result)
  }
}
