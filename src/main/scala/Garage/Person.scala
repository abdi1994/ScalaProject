package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person()  {

  val name : String
  val age : Int
  var email : String
  var telephoneNumber : String
  var address : String
  var wallet : Int



  //Setter

//  def Setter (name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int): Any = {
//    name = name1
//    age = age1
//    email = email1
//    telephoneNumber = telephoneNumber1
//    address = address1
//    wallet = wallet1
//  }



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

  def getAddress : String = {
    address
  }

  def getWallet : Int = {
    wallet
  }

  //ToString

  def ToString = {
    "Name: %s \nAge: %s\nEmail: %s\nTelephone Number: %s\nAddress: %s\nWallet: %s".format(name, age, email, telephoneNumber, address, wallet)
  }

}
