package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

import scala.collection.mutable
import scala.collection.mutable.Stack

/**
  * Created by lqin200 on 6/5/17.
  */
object Problem496 extends Jobs {
  def nextGreaterElement(findNums: Array[Int], nums: Array[Int]): String = {
    var map = Map.empty[Int, Int]
    val stack = Stack[Int]()
    var arr = Array.empty[Int]
    for (num <- nums) {
      if (stack.nonEmpty && num > stack.top) {
        map += stack.top -> num
      }
      stack.push(num)
    }

    for (i <- findNums) {
      arr :+= map.getOrElse(i, -1)
    }
    arr.mkString(",")
  }

  /*  def main(args: Array[String]): Unit = {
      val arr1 = Array(1,4,3)
      val arr2 = Array(2,1,5,3,4)
      nextGreaterElement(arr1, arr2).foreach(println(_))
    }*/
}
