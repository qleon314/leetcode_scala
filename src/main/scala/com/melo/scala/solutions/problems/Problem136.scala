package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem136 extends Jobs {
  def singleNumber(nums: Array[Int]): Int = {
    var result = 0
    for (num <- nums) result ^= num
    result
  }
}
