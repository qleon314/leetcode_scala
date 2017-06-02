package com.melo.scala.solutions.core

import com.melo.scala.solutions.problems._

/**
  * Created by lqin200 on 5/14/17.
  */
object Driver {

  def main(args: Array[String]): Unit = {
    var problemIndex: String = "575"
    var input: Any = ""
    val result = problemIndex match {
      case "461" => Problem461.hammingDistance(3, 4)
      case "561" => Problem561.arrayPairSum(Array(9, 8, 7, 6, 5, 4, 3, 2))
      case "476" => Problem476.findComplement(12)
      case "566" => Problem566.matrixReshape(Array(Array(1, 2, 3, 4), Array(9, 10, 11, 12), Array(5, 6, 7, 8)), 2, 6)
      case "557" => Problem557.reverseWords("Let's have some fun!")
      case "575" => Problem575.distributeCandies(Array(1, 1, 1, 1, 2, 5))
    }
    println("result is: " + result.toString)
  }
}
