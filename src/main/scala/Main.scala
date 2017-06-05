/**
  * Created by Administrator on 05/06/2017.
  */
object Main {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    var a = 10
    var b = 11

    if(b == a) {
      println("Equal values")
    }
    else {
      println("Not equal")
    }

    def testfunction(value1 : Int, value2: Int): Unit = {
      var a = value1
      var b = value2

      var c = a + b

      println(c)



    }

    testfunction(1, 5)

  }



}
