package com.barath.algorithms
/*
Insertion Sort
 */
object InsertionSort {

  def main(args: Array[String]): Unit = {

    val inputArray : Array[Int] =  Array[Int](14,43,545,33,22,6,8,8)

    def insertionSort (col : Array[Int]): Array[Int] ={

      var maxEle = 0
      var temp = 0

      for (i <- 1 to inputArray.length -1 ){

        if(inputArray(i) == inputArray(maxEle)){print("Both the values are equal")}
        if(inputArray(i) > inputArray(maxEle)){

          temp = inputArray(maxEle)
          inputArray(maxEle) = inputArray(i)
          inputArray(i) = temp

        }else{
          print("Already in order")
        }
        maxEle += 1
      }

      col

    }
    val sortedArray = insertionSort(inputArray)
    sortedArray.foreach(println)

  }

}
