package com.barath.collections

object TupleCollection {

  def main(args: Array[String]): Unit = {

    val t = new Tuple3 (1, "hello", Console)

    val sum = t._1 + t._2 + t._3

    println(sum)
  }

}
