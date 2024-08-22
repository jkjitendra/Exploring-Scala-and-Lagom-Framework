package org.cricbuzz.ScalaLearning

object TypesInScala {
  def main(args: Array[String]): Unit = {

     // usage of Scale Type Hierarchy
//        val list: List[Any] = List(
//          "a string",
//          732, // an integer
//          'c', // a character
//          true, // a boolean value
//          () => "an anonymous function returning a string" // an anonymous function
//        )

//        list.foreach(element => println(element))

     // usage of Type Casting
//        Value types can be cast in following ways:-
//        Byte -> Short -> Int -> Long -> Float -> Double
//        Char -> Int
//
//        val x: Long = 987654321
//        val y: Float = x.toFloat // 9.8765434E8 (note that some precision is lost in this case)
//
//        println(y)
//
//        val face: Char = '☺'
//        val charC: Char = 'c'
//        val number: Int = face // 9786
//        val intC: Int = charC // 99
//
//        println(number + " " + intC)
//
//        val x: Long = 987654321
//        val y: Float = x.toFloat // 9.8765434E8
//        val z: Long = y // Does not conform

     // usage of Nothing and Null
//        Nothing is a subtype of all types, also called the bottom type.
//        There is no value that has type Nothing
//        A common use is to signal non-termination such as a
//        thrown exception, program exit, or an infinite loop
//        (i.e., it is the type of an expression which does not evaluate
//        to a value, or a method that does not return normally).
//
//        Null is a subtype of all reference types (i.e.
//        any subtype of AnyRef). It has a single value identified
//        by the keyword literal null. Null is provided mostly for
//        interoperability with other JVM languages and should almost
//        never be used in Scala code.
  }

}
