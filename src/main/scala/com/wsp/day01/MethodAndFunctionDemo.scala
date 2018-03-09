package com.wsp.day01

object MethodAndFunctionDemo {
  def main(args: Array[String]): Unit = {

    def m1(f:(Int,Int)=>Int):Int={
      f(2,6)
    }

    var f = (x:Int,y:Int)=> {
      x+y
    }
    println(m1(f))

    var f1 = m1 _

    def m2(x:Int, y:Int):Int = {
      x*y
    }
    var f2 = (x:Int, y:Int) => {
      m2(x,y)
    }
    var f3 = (f:(Int,Int)=>Int) =>{
      m1(f)
    }
    println(f3(f))

    // TODO 定义函数方式1，自动判断返回类型
    var hanshu1 = (x:Int,y:Int)=> {
      x+y
    }
    // TODO 定义函数方式2，显示指定返回类型
    var hanshu2 :(Int, Int) => Int = {
      (x,y) => {
        x+y
      }
    }
  }
}
