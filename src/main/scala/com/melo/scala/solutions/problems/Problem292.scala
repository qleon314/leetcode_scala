package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem292 extends Jobs {
  def canWinNim(num: Int): Boolean = {
    num % 4 != 0
  }
}
