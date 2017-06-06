package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem521 extends Jobs {
  def findLUSlength(a: String, b: String): Int = {
    if (a.equals(b)) return -1

    val intersect = a.intersect(b)
    val aBefore = a.substring(0, a.indexOf(intersect)).length
    val aBehind = a.substring(a.indexOf(intersect), a.length).length - intersect.length
    val bBefore = b.substring(0, b.indexOf(intersect)).length
    val bBehind = b.substring(b.indexOf(intersect), b.length).length - intersect.length

    Math.max(Math.max(aBefore, aBehind), Math.max(bBefore, bBehind))
  }
}
