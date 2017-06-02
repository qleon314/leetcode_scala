package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/2/17.
  */
object Problem575 extends Jobs {
  def distributeCandies(candies: Array[Int]): Int = {
    var set = Set.empty[Int]
    for (candy <- candies) set += candy
    if (set.size < candies.length / 2) set.size else candies.length / 2
  }
}
