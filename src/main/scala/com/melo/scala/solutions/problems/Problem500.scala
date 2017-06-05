package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/5/17.
  */
object Problem500 extends Jobs {
  def findWords(arr: Array[String]): String = {
    val map: Map[Char, Char] = Map(
      'q' -> 'q', 'w' -> 'q', 'e' -> 'q', 'r' -> 'q', 't' -> 'q', 'y' -> 'q', 'u' -> 'q', 'i' -> 'q', 'o' -> 'q', 'p' -> 'q',
      'a' -> 'a', 's' -> 'a', 'd' -> 'a', 'f' -> 'a', 'g' -> 'a', 'h' -> 'a', 'j' -> 'a', 'k' -> 'a', 'l' -> 'a',
      'z' -> 'z', 'x' -> 'z', 'c' -> 'z', 'v' -> 'z', 'b' -> 'z', 'n' -> 'z', 'm' -> 'z')
    var set = Set.empty[Char]
    var answer = Array.empty[String]
    for (str <- arr) {
      for (i <- str.toLowerCase; if set.size < 2) {
        set += map(i)
      }
      if (set.size < 2) answer :+= str
    }
    answer.mkString(", ")
  }

  /*  def main(args: Array[String]): Unit = {
      val arr = Array("aaaaa", "Alaska", "qa", "banana")
      print("result is : " + findWords(arr))
    }*/
}
