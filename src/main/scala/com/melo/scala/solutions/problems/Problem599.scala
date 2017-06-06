package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

import scala.collection.mutable.Stack

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem599 extends Jobs {
  def findRestaurant(list1: List[String], list2: List[String]): List[String] = {
    val intersect = list1.intersect(list2)
    val stack = Stack[String]()
    for (str <- intersect) {
      val rank = list1.indexOf(str) + list2.indexOf(str)

      while (stack.nonEmpty) {
        val preRank = list1.indexOf(stack.top) + list2.indexOf(stack.top)
        if (rank < preRank) {
          stack.clear()
          stack.push(str)
        }
        else if (rank == preRank) stack.push(str)
      }
      stack.push(str)
    }
    stack.toList
  }
}
