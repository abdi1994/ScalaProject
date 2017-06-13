package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Person  {

  var name : String = ""
  var age : Int = 0
  var email : String = ""
  var telephoneNumber : String = ""
  var address : String = ""
  var wallet : Int = 0



  //Setter

  def Person (name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int): Unit = {
    this.name = name1
    this.age = age1
    this.email = email1
    this.telephoneNumber = telephoneNumber1
    this.address = address1
    this.wallet = wallet1
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

//  val e = new Person("test", 20, "test", "test")


}
