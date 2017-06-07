package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

import scala.collection.mutable.Stack

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem599 extends Jobs {
  def findRestaurant(list1: List[String], list2: List[String]): List[String] = {
    val intersect = list1.intersect(list2)
    var result = Stack[String]()
    for (str <- intersect) {
      val rank = list1.indexOf(str) + list2.indexOf(str)
      if (result.isEmpty) result.push(str)
      else {
        val preRank = list1.indexOf(result.top) + list2.indexOf(result.top)
        if (rank == preRank) result.push(str)
        else if (rank < preRank) {
          result.clear()
          result.push(str)
        }
      }
    }
    result.toList
  }
}
