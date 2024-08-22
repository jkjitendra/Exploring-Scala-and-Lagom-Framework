package org.cricbuzz.ScalaLearning

object OOPsInScala {

  def main(args: Array[String]): Unit = {

    // class User
//     val user1 = new User
//     User has a default constructor which takes no arguments
//     because no constructor was defined

//    class Point(var x: Int, var y: Int) {
//      def move(dx: Int, dy: Int): Unit = {
//        x = x + dx
//        y = y + dy
//      }
//      override def toString: String =
//        s"($x, $y)"
//    }
//     This Point class has four members:
//     the variables x and y and the methods move and toString

//    val point1 = new Point(2, 3)
//    println(point1.x) // prints 2
//    println(point1) // prints (2, 3)

    // usage of Constructors
//    class Point(var x: Int = 0, var y: Int = 0) {
//      override def toString: String = s"$x, $y"
//    }
//
//    val origin = new Point // x and y are both set to 0
//    val point = new Point(1, 1) // x is set to 1 and y is set to 1
//    val pointWithX = new Point(1) // x is set to 1 and y is set to 0
//    val pointWithY = new Point(y = 1) // x is set to 1 and y is set to 0
//    println(origin) // prints (0, 0)
//    println(pointWithY) // prints (0, 1)
//    println(pointWithX) // prints (1, 0)
//    println(point) // prints (1, 1)

    // usage of Private Members and Getter/Setter Syntax
//    class Point {
//      private var _x = 0
//      private var _y = 0
//      private val bound = 100
//
//      def x: Int = _x
//
//      def x_=(newValue: Int): Unit = {
//        if (newValue < bound)
//          _x = newValue
//        else
//          printWarning()
//      }
//
//      def y: Int = _y
//
//      def y_=(newValue: Int): Unit = {
//        if (newValue < bound)
//          _y = newValue
//        else
//          printWarning()
//      }
//
//      private def printWarning(): Unit =
//        println("WARNING: Out of bounds")
//    }
//
//    val point1 = new Point
//    point1.x = 99
//    point1.y = 101 // prints the warning

  }
}
