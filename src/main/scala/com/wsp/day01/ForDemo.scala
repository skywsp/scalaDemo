package com.wsp.day01

object ForDemo {
  def main(args:Array[String]): Unit ={

    for(i <- 1 to 10){
      println(i)
    }

    val arr = Array("a",'b', "c", 1, 9.3)
    for(i <- arr){
      println(i)
    }

    for(i <- 1 to 3; j <- 1 to 3; if i != j){
      println("i="+i+",j="+j)
    }

    val v = for(i <- 1 to 10) yield i*10
    println(v)

  }

  // 方法
  def f1 (x:Int,y:Int):Int = {
    x+y
  }

  // 函数
  val f2 = (x:Int,y:Int) => {
    x+y
  }

}














