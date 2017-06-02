package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/2/17.
  */
object Problem566 extends Jobs {
  def matrixReshape(nums: Array[Array[Int]], r: Int, c: Int): Unit = {
    var finalMatrix: Array[Array[Int]] = Array.ofDim(r, c)
    val hgt = nums.length
    val len = nums(0).length
    var result = Array.empty[String]

    if (hgt * len != r * c) {
      result = nums.map(_.mkString(","))
    } else {
      for (i <- 0 until r * c) {
        finalMatrix(i / c)(i % c) = nums(i / len)(i % len)
      }
      result = finalMatrix.map(_.mkString(","))
      result.foreach(x => println(x))
    }
  }
}
