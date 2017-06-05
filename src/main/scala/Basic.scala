/**
  * Created by Administrator on 05/06/2017.
  */
object Basic {

  def main(args: Array[String]): Unit = {

    println("Hello World! \n")

    def CallWorldFunction(): Unit = {
      val a = "Hello World"
      println(a)
    }

    CallWorldFunction()

    def StringParameter(strpar : String): Unit = {
      println(strpar)
    }

    StringParameter("hello")


    def TypeInf(tyin : Any): Unit = {
      println(tyin)
    }

    TypeInf(5)


    def TwoStringReturn(str : String, value1 : Int): Unit = {

      var EmptyString = ""
      var b = str.length

      var f = str.splitAt(value1)


      println(f)

    }

    def ConCatString (str1 : String,str2 : String,str3 : String,str4 : String): Unit = {
      var a = str1.concat(str2).concat(str3).concat(str4)

      println(a)




    }

    ConCatString("h", "el", "lo", "!")

    def TwoOperatorInt (int1 : Int, int2 : Int): Unit = {
      var a = int1 + int2

      println(a)
    }

    TwoOperatorInt(3, 6)

    def ConditionalsTest (int1 : Int, int2 : Int, bool : Boolean): Unit = {
      var a = int1 + int2
      var b = int1*int2

      if (bool == true) {
        println(a)
      }
      else if (bool == false) {
        println(b)
      }
    }

    ConditionalsTest(2, 15, false)

    def ConditionalTest2 (int1 : Int, int2 : Int): Unit = {

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

    ConditionalTest2(2, 0)

    def Iteration (str : String, int1 : Int): Unit = {

      var a = int1

      while (a != 0) {
        println(str)
        a = a - 1;
      }

    }

    Iteration("Test", 3)


    def Iteration2 (str : String, int1 : Int): Unit = {

      var a = int1

      for (x <- a until a by 1)  {
        while (a != 0) {
          println(str)
          a = a - 1;
        }
        println("\n")
      }


    }

    Iteration2("H", 4)


    println("\n \n \n \n")



    def FizzBuzz(str1 : String, str2 : String, int1 : Int): Unit = {
      var x = 1

      while (x <= int1) {
        if(x % 3 == 0) {
          print(str1)
        }
        else if (x % 5 == 0) {
          print(str2)
        }
        else if (x % 3 == 0 && int1 % 3 == 0) {
          print(str1.concat(str2))
        }
        else {
          print(x)
        }
        x = x + 1
      }


    }

    FizzBuzz("fizz", "Buzz", 15)


    def Iteration1Recursion (str : String, int1 : Int): Unit = {



      if (int1 > 0) {
        println(str)
        Iteration1Recursion(str ,int1 - 1)
      }


    }


    Iteration1Recursion("Hi", 4)


    def Iteration3Recursion (str1 : String, str2 : String, int1 : Int): Unit = {
      var x = 1

      if (x <= int1) {
        if (x % 3 == 0) {
          print(str1)
        }
        else if (x % 5 == 0) {
          print(str2)
        }
        else if (x % 3 == 0 && int1 % 3 == 0) {
          print(str1.concat(str2))
        }
        else {
          print(x)
        }
        Iteration3Recursion(str1, str2, x + 1)
      }
    }

    Iteration3Recursion("fizz", "Buzz", 15)

    }





}
