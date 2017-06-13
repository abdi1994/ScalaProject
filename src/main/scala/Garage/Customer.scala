package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Customer extends Person with Vehicle {

  var CustomerID = ""
  var vehicleID = ""

  //Setter
  def Customer(customerid : String, vehicleID : String,name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int): Unit = {
    this.CustomerID = customerid
    this.VehicleID = vehicleID
    this.name = name1
    this.age = age1
    this.email = email1
    this.telephoneNumber = telephoneNumber1
    this.address = address1
    this.wallet = wallet1
  }


  //Getter
  def getCustomerID : String = {
    CustomerID
  }


}
