package com.melo.scala.solutions.problems

/**
  * Created by lqin200 on 6/6/17.
  */
object Problem520 {
  def detectCapitalUse(word: String): Boolean = {
    for (char <- word) {
      if (char < 'a' && word.indexOf(char) != 0 && word.dropWhile(_ == char).exists(x => x > 'a')) return false
    }
    true
  }

  def detectCapitalUseReg(word: String): Boolean = {
    word.matches("[A-Z]*|[A-Z]?[a-z]*")
  }

}
