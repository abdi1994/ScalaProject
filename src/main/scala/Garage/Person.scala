package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person()  {

  val name : String
  val age : Int = 0
  val email : String = ""
  val telephoneNumber : String
  val address : String
  //val wallet : Int



  //Setter

//  def Setter (name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int): Any = {
//    name = name1
//    age = age1
//    email = email1
//    telephoneNumber = telephoneNumber1
//    address = address1
//    wallet = wallet1
//  }

//  def Person (name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int): Unit = {
//    this.name = name1
//    this.age = age1
//    this.email = email1
//    this.telephoneNumber = telephoneNumber1
//    this.address = address1
//    this.wallet = wallet1
//  }

//  def setName (name1 : String): Any = {
//    name = name1
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

//  def getWallet : Int = {
//    wallet
//  }

  //ToString

  def ToString = {
    "Name: %s \nAge: %s\nEmail: %s\nTelephone Number: %s\nAddress: %s".format(name, age, email, telephoneNumber, address, )
  }

}

//Wallet: %s(wallet)
