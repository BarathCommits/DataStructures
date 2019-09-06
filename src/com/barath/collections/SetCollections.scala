package com.barath.collections

/*
Scala Set is a collection of pairwise different elements of the same type. I
n other words, a Set is a collection that contains no duplicate elements.
There are two kinds of Sets, the immutable and the mutable.
The difference between mutable and immutable objects is that when an object is immutable, the object itself can't be changed.
 */

object SetCollections {

  def main(args: Array[String]): Unit = {

    val indegeniousCars : Set[String] = Set("Maruthi", "Mahendra", "Tata","Maruthi")
    val importedCars = Set("Hundai","Honda","Maruthi")

    val allCars = indegeniousCars ++ importedCars
    //print(allCars)

    val allCarChangePref = importedCars.++(indegeniousCars)

    val carIntersect = indegeniousCars.&(importedCars)

    //print(carIntersect)

    //println(importedCars.contains("Maruthi"))
    //println(importedCars.min)

    val testString = new StringBuilder

    testString ++= "Including Maruthi "
    testString ++= "Including Hundai "
    val stringBuilder = importedCars.addString(testString++= " ")

    //println(stringBuilder)

    println(indegeniousCars.scanLeft("Hi ")((x,y) => { x.toLowerCase + "->" + y.toUpperCase}))



  }

}
