package com.melo.scala.solutions

import com.melo.scala.solutions.core._

/**
  * Created by lqin200 on 5/14/17.
  */
object Problem461 extends jobs {
  def hammingDistance(x: Int, y: Int): Int = {
    Integer.bitCount(x ^ y)
  }

  override def main(args: Array[String]): Unit = {
    val x = 2
    val y = 9
    val result = hammingDistance(x, y)
    System.out.println(s"hammingDistance between $x and $y is " + result)
  }
}
