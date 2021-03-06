package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core._

/**
  * Created by lqin200 on 5/30/17.
  */
object Problem561 extends Jobs {
  def arrayPairSum(nums: Array[Int]): Int = {
    val srt = nums.sortWith((r1, r2) => r1 < r2)
    var result = 0
    for (i <- srt.indices if i % 2 == 0)
      result += srt(i)
    result
  }
}
