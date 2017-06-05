package com.melo.scala.solutions.problems

import com.melo.scala.solutions.core.Jobs

/**
  * Created by lqin200 on 6/5/17.
  */
object Problem412 extends Jobs {
  def fizzBuzz(n: Int): List[String] = {
    var list = List.empty[String]
    var arr = Array.empty[Int]
    (1 to n).foreach {
      case x if x % 3 == 0 && x % 5 != 0 => list :+= "Fizz"
      case y if y % 3 != 0 && y % 5 == 0 => list :+= "Buzz"
      case z if z % 3 == 0 && z % 5 == 0 => list :+= "FizzBuzz"
      case none => list :+= none.toString
    }
    list
  }
}
