package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core._

/**
  * Created by lqin200 on 5/14/17.
  */
object Problem461 extends Jobs {
  def hammingDistance(x: Int, y: Int): Int = {
    Integer.bitCount(x ^ y)
  }
}
