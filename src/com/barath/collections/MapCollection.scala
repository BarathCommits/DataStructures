package com.barath.collections

/*Scala map is a collection of key/value pairs. Any value can be retrieved based on its key.
Keys are unique in the Map, but values need not be unique. Maps are also called Hash tables.
There are two kinds of Maps, the immutable and the mutable.
The difference between mutable and immutable objects is that when an object is immutable, the object itself can't be changed.
*/

object MapCollection {


  def main(args: Array[String]):Unit ={

    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

    //print(colors1++colors2)


    val reduce = colors1.-("red")

   // print(reduce)

    val iterator = colors1.iterator

    val testString : StringBuilder = new StringBuilder
    testString ++= "Hi String Builder Adding to the Map "

    val stringBuild = reduce.addString(testString)

    //print(stringBuild)

     colors1.keys.foreach(x => println(colors1.get(x)))

    // colors1.product(1)()


  }
}
