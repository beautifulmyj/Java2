package com.apple.collection

object Play001 {
  def main(args: Array[String]): Unit = {
    var col1 = Array(1,2,3,4,5)
    var col2 = Set(1,2,2,3,4,5,6,6)

    for (i <- col1) {
      println(i)
    }
  }
}
