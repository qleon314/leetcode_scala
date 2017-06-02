package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/2/17.
  */
object Problem557 extends Jobs {
  def reverseWords(str: String): String = {
    var arr = str.split(" ", -1)
    for (i <- arr.indices) {
      arr(i) = arr(i).reverse
    }
    arr.mkString(" ")
  }
}
