package com.barath.collections

/*
Scala Lists are quite similar to arrays which means, all the elements of a list have the same type but there are two important differences.
First, lists are immutable, which means elements of a list cannot be changed by assignment.
Second, lists represent a linked list whereas arrays are flat.
 */


object ListCollections {

  def main(args: Array[String]): Unit = {

    val outSideFruit :List[String] = "Apple" :: ("Orange" :: ("Pears" :: Nil))

    val insideFruit : List[String] = "Banana" :: ("Guva" :: ("Mango" :: Nil))

    val fruit = outSideFruit.:::(insideFruit)

    //print(fruit)

    val prepend = outSideFruit.::("Apple")

    val fifth = fruit.apply(4)

    val distinctOutSide = outSideFruit.distinct

    val drop5 : List[String]  = outSideFruit.drop(2)

    val dropRight = outSideFruit.dropRight(2)

    val endsWith = outSideFruit.endsWith(Nil)

    val filterList = fruit.filter(_.equals("Apple"))

    val toMap = fruit.zipWithIndex.map(x => (x._2, x._1) ).toMap

    val toSet = fruit.toSet

    val toBuffer = fruit.toBuffer
    println(toBuffer)
  }

}
