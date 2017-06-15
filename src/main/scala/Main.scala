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
    Functional1()
    Blackjack(18, 21)
    Blackjack(20, 18)
    Blackjack(22, 22)
    UniqueSum(1, 2, 3)
    UniqueSum(3, 3, 3)
//    UniqueSum2(1, 2, 3)
//    UniqueSum2(3, 3, 3)
//    UniqueSum2(1, 1, 2)
    TooHot(80, false)
    TooHot(100, false)
    TooHot(100, true)

    println()

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


    println(z.replace(char1, char2))


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

    def swap(pair : Any): Any = pair match {
      case list @ List(i, j) => List(j, i)
      case array @ Array(i, j) => Array(j, i)
      case (i, j) => (j, i)
      case collect : Seq[Int] if collect.size > 2 => swap(collect.take(2))
      case _ => "Not Valid."
    }

  }

  def Functional1(): Unit = {

    java.util.TimeZone.getAvailableIDs.map(item => item.split("/").last).filter(_.length > 3).grouped(10).map(a=>a(0)).toList

  }

  def Blackjack(int1 : Int, int2 : Int): Unit = {
    if(int1 > int2 && (int1 <= 21 && int1 >= 1)) {
      println(int1)
    }
    else if(int2 > int1 && (int2 <= 21 && int2 >= 1)) {
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
//    val set = Set(int1, int2, int3)
//
//    if(set.size > 1) {
//      println(set.sum)
//    }
//    else if (set.size == 1) {
//      println("0")
//    }

    val inputs = List(int1, int2, int3)
    var sum = 0
    inputs.foreach(input => if (inputs.count(x => x == input) == 1) sum += input)
    sum

  }

//  def UniqueSum2(int1 : Int, int2 : Int, int3 : Int): Unit = {
//    val list = List(int1, int2, int3).sorted
//    var temp = 0
//
//    for(i <- 0 until list.length) {
//
//      if (list(i) == list((i+1)%3) || list(i) == list((i-1)%3)) {
//      }
//      else{
//        temp = temp + list(i)
//
//      }
//      println(temp)
//    }
//
//  }


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

  def PrimeNumbers1(int1 : Int): Unit = {
    require(int1 >= 2)

    def test(x : Int, primes : List[Int]) : List[Int] = {
      if (x >= int1) primes
      else if (prime(x, primes)) test(x + 1, x :: primes)
      else test(x + 1, primes)
    }
    test(2, List()).reverse
  }

 // def prime(num : Int, factors : List[Int]) : Boolean = factors.forall(num % _! = 0)



}
