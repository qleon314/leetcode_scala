package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core._

/**
  * Created by lqin200 on 6/2/17.
  */
object Problem476 extends Jobs {
  def findComplement(num: Int): Int = {
    ~num & (Integer.highestOneBit(num) - 1)
  }
}
