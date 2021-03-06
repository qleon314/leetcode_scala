package com.melo.scala.solutions.core

import com.melo.scala.solutions.problems._

/**
  * Created by lqin200 on 5/14/17.
  */
object Driver {

  def main(args: Array[String]): Unit = {
    val problemIndex: String = "599"
    val result = problemIndex match {
      case "461" => Problem461.hammingDistance(3, 4)
      case "561" => Problem561.arrayPairSum(Array(9, 8, 7, 6, 5, 4, 3, 2))
      case "476" => Problem476.findComplement(12)
      case "566" => Problem566.matrixReshape(Array(Array(1, 2, 3, 4), Array(9, 10, 11, 12), Array(5, 6, 7, 8)), 2, 6)
      case "557" => Problem557.reverseWords("Let's have some fun!")
      case "575" => Problem575.distributeCandies(Array(1, 1, 1, 1, 2, 5))
      case "500" => Problem500.findWords(Array("AaAaa", "Alaska", "qa", "banana"))
      case "412" => Problem412.fizzBuzz(15)
      case "344" => Problem344.reverseString("Stupid")
      case "496" => Problem496.nextGreaterElement(Array(1, 4, 3), Array(2, 1, 5, 3, 4))
      case "463" => Problem463.islandPerimeter(Array(Array(0, 1, 0, 0), Array(1, 1, 1, 0), Array(0, 1, 0, 0), Array(1, 1, 0, 0)))
      case "292" => Problem292.canWinNim(8)
      case "485" => Problem485.findMaxConsecutiveOnes(Array(1, 1, 1, 1, 1, 1))
      case "136" => Problem136.singleNumber(Array(1, 6, 2, 2, 3, 4, 6, 1, 3))
      case "521" => Problem521.findLUSlength("apple", "ppleqwe")
      case "520" => Problem520.detectCapitalUseReg("apple") //multi implementations
      case "448" => Problem448.findDisappearedNumbers(Array(4, 3, 2, 7, 8, 2, 3, 1))
      case "599" => Problem599.findRestaurant(List("Shogun", "Tapioca Express", "Burger King", "KFC"), List("KFC", "Shogun", "Burger King"))
    }
    println("result is: " + result.toString)
  }
}
