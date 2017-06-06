import java.util
import java.util.TimeZone
/**
  * Created by Administrator on 05/06/2017.
  */
object Main {

  def main(args: Array[String]): Unit = {

    println("Hello World!")
    Assignment()
    Parameters("Hello World! - Parameters")
    TypeInference(12)
    TypeInference("Hello World! - Type")
    TypeInference(12.5)
    TypeInference(true)
    Strings("Hello", 3)
    String2("Ha", "llo", 'a', 'e')
    Operators(3, 5)
    Conditionals(2, 4, true)
    Conditionals(2, 4, false)
    Conditionals2(2, 0)
    Conditionals2(0, 5)
    Iteration("Hi", 3)
    Iteration2("H", 4)
    Iteration3("Fizz", "Buzz", 15)
    Iteration1Recursion("Hi", 3)
    Iteration2Recursion("H", 4)
    Iteration3Recursion("Fizz", "Buzz", 15)
    PatternMatchingConditional1(2, 4, true)
    PatternMatchingConditional1(2, 4, false)
    PatternMatchingConditional2(2, 0)
    PatternMatchingConditional2(0, 5)

    Blackjack(18, 21)
    Blackjack(20, 18)
    Blackjack(22, 22)
    UniqueSum(1, 2, 3)
    UniqueSum(3, 3, 3)
    UniqueSum(1, 1, 2)
    TooHot(80, false)
    TooHot(100, false)
    TooHot(100, true)

    println()

    Functional1()

  }

  def Assignment(): Unit = {
    var str : String = "Hello world!"
    println(str)
  }

  def Parameters(str : String): Unit = {
    println(str)
  }

  def ReturnTypes(str : String): Unit = {

  }

  def TypeInference(a : Any): Unit = {
    println(a)
  }

  def Strings(str : String, x : Int): Unit = {
    println(str takeRight(x))
  }

  def String2(str1 : String, str2 : String, char1 : Char, char2 : Char): Unit = {

    var z = str1.concat(str2)
    var w = char1
    var e = char2



  }

  def Operators(int1 : Int, int2 : Int): Unit = {
    println(int1 + int2)
  }

  def Conditionals(int1 : Int, int2 : Int, bool : Boolean): Unit = {
    if (bool == true) {
      println(int1 + int2)
    }
    else if (bool == false) {
      println(int1 * int2)
    }
  }

  def Conditionals2(int1 : Int, int2 : Int): Unit = {
    if (int1 == 0) {
      println(int2)
    }
    else if (int2 == 0) {
      println(int1)
    }
    else {
      println(int1+int2)
    }
  }

  def Iteration(str : String, x : Int): Unit = {

    for (z <- 0 until x by 1) {
      println(str)
    }

  }

  def Iteration2(str : String, x : Int): Unit = {
    for (z <- 0 until x by 1) {
      for (z <- 0 until x by 1) {
        print(str)
      }
      println()
    }
  }

  def Iteration3(str1 : String, str2 : String, int1 : Int): Unit = {
    var x = 1

    while (x <= int1) {
      if(x % 3 == 0) {
        print(str1 + ",")
      }
      else if (x % 5 == 0) {
        print(str2 + ",")
      }
      else if (x % 3 == 0 && x % 3 == 0) {
        print(str1.concat(str2 + ","))
      }
      else {
        print(x + ",")
      }
      x = x + 1
    }

    println()
  }

  def Iteration1Recursion(str1 : String, int1 : Int): Unit = {

    if (int1 >= 0) {
      println(str1)
      Iteration(str1, int1 - 1)
    }

  }

  def Iteration2Recursion(str1 : String, int1 : Int): Unit = {
    Iteration2(str1, int1)
  }

  def Iteration3Recursion(str1 : String, str2 : String, int1 : Int): Unit = {
    Iteration3(str1, str2, int1)
  }

  def PatternMatchingConditional1(int1 : Int, int2 : Int, bool : Boolean): Unit = {
    bool match {
      case true => println(int1 + int2)
      case false => println(int1 * int2)
      case _ => println()
    }
  }

  def PatternMatchingConditional2(int1 : Int, int2 : Int): Unit = {
    int1 match {
      case 0 => println(int2)
      case _ => println()
    }

    int2 match {
      case 0 => println(int1)
      case _ => println()
    }
  }

  def PatternMatching2(any : Any): Unit = {



  }

  def Functional1(): Unit = {
    val x : Array[String] = TimeZone.getAvailableIDs
    val xs : String = x.mkString("      ").filter(true
    )
    println(xs)
    //
    //xs.split("/")

    // for(x <- 0 until xs.size by 1) {
    // xs.takeRight(.split("/"));
    //}

    //val s = Map(TimeZone.getAvailableIDs)


    //val x : Map[String, String] = Map(TimeZone.getAvailableIDs).mkString()


    //print(Map(null, TimeZone.getAvailableIDs).mkString("---").split("/").filter(true).grouped(10))

  }

  def Blackjack(int1 : Int, int2 : Int): Unit = {
    if(int1 > int2 && int1 <= 21) {
      println(int1)
    }
    else if(int2 > int1 && int2 <= 21) {
      println(int2)
    }
    else if(int1 == int2 && (int1 <= 21 && int2 <= 21)) {
      println("Draw")
    }
    else if(int1 > 21 && int2 > 21) {
      println("0")
    }
  }

  def UniqueSum(int1 : Int, int2 : Int, int3 : Int): Unit = {
    println()
    val set = Set(int1, int2, int3)

    if(set.size > 1) {
      println(set.sum)
    }
    else if (set.size == 1) {
      println("0")
    }

  }

  def TooHot(int1 : Int, bool : Boolean): Unit = {
    bool match {
      case true =>
        if (int1 >= 60 && int1 <= 100) {
          println(true)
        }
        else {
          println(false)
        }
      case false =>
        if (int1 >= 60 && int1 <= 90) {
          println(true)
        }
        else {
          println(false)
        }
    }
  }

}
