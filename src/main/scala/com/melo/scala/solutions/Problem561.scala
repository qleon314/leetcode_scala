package com.melo.scala.solutions

/**
  * Created by lqin200 on 5/30/17.
  */
object Problem561 {
  def arrayPairSum(nums: Array[Int]): Int = {
    val srt = nums.sortWith((r1, r2) => r1 < r2)
    var result = 0
    for (i <- srt.indices if i % 2 == 0)
      result += srt(i)
    result
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(7, 6, 3, 2, 4, 9, 5, 8)
    println("arrayPairSum is " + arrayPairSum(nums))
  }
}
