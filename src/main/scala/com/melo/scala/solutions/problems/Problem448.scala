package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem448 extends Jobs {
  def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
    var set = Set.empty[Int]
    (1 to nums.length).foreach(set += _)
    for (i <- nums) set -= i
    set.toList
  }
}
