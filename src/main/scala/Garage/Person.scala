package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Person {

  var name : String = ""
  var age : Int = 0
  var email : String = ""
  var telephoneNumber : String = ""



  //Setter

  def Person (name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String): Unit = {
    this.name = name1
    this.age = age1
    this.email = email1
    this.telephoneNumber = telephoneNumber1
  }

  //Getter

  def getName : String = {
    name
  }

  def getAge : Int = {
    age
  }

  def getEmail : String = {
    email
  }

  def getTelephonenumber : String = {
    telephoneNumber
  }

  //ToString

  def ToString = {
    "Name: %s \nAge: %s\nEmail: %s\nTelephone Number: %s".format(name, age, email, telephoneNumber)
  }


}
