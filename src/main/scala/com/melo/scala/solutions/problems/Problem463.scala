package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem463 extends Jobs {
  def islandPerimeter(grid: Array[Array[Int]]): Int = {
    var islands = 0
    var neighbors = 0
    for (i <- grid.indices) {
      for (j <- grid(0).indices) {
        if (grid(i)(j) == 1) {
          islands += 1
          if (j < grid.length - 1 && grid(i)(j + 1) == 1) neighbors += 1
          if (i < grid(0).length - 1 && grid(i + 1)(j) == 1) neighbors += 1
        }
      }
    }
    islands * 4 - neighbors * 2
  }
}
