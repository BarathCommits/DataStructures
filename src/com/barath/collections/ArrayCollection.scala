package com.barath.collections
import Array._
/*
Scala provides a data structure, the array,
which stores a fixed-size sequential collection of elements of the same type.
 An array is used to store a collection of data,
but it is often more useful to think of an array as a collection of variables of the same type.
 */

object ArrayCollection {


  def main(args: Array[String]): Unit = {

    var z: Array[String] = new Array[String](3)

    z(0) = "Cow"
    z(1) = "Horse"
    z(2) = "Dog"
    var total = 0

    for (i <- (0 to z.length - 1)) {

      //println(i)

      total += i
    }

    //println("Total : "+total)

    var matrix = ofDim[Int](3, 3)

    for (i <- 0 to 2) {

      for (j <- 0 to 2) {

        matrix(i)(j) = j
      }
    }

  }
  //println("Test")
  import java.text.SimpleDateFormat
  import java.util.Calendar

  def tabFun[T](i : T) ={
    //print(i)
    val today = Calendar.getInstance.getTime
    val minuteFormat = new SimpleDateFormat("mm")
    val hourFormat = new SimpleDateFormat("hh")
    val amPmFormat = new SimpleDateFormat("a")
    //val seconds = new SimpleDateFormat(pattern = "")
    val currentHour = hourFormat.format(today)

    today

  }


  val xsTab = List.tabulate(5)(tabFun(_))

  println(xsTab)



}
