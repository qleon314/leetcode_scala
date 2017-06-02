package com.melo.scala.solutions.core

import com.melo.scala.solutions.problems._

/**
  * Created by lqin200 on 5/14/17.
  */
object Driver {

  def main(args: Array[String]): Unit = {
    var problemIndex: String = "Problem476"
    var input: Any = ""
    val result = problemIndex match {
      case "Problem461" => Problem461.hammingDistance(3, 4)
      case "Problem561" => Problem561.arrayPairSum(Array(9, 8, 7, 6, 5, 4, 3, 2))
      case "Problem476" => Problem476.findComplement(12)
    }
    println("result is: " + result)
  }
}
