package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem485 extends Jobs {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    var maxCount = 0
    var count = 0
    for (i <- nums) {
      if (i == 1) count += 1
      else count = 0

      if (count > maxCount) maxCount = count
    }
    maxCount
  }
}
