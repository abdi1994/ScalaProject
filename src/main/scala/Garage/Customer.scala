package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Customer (name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int) extends Person(name1, age1, email1, telephoneNumber1, address1, wallet1) {

  var CustomerID = ""

  //Setter
  def Customer(customerid : String): Unit = {
    this.CustomerID = customerid
//    this.VehicleID = vehicleID
//    this.name = name1
//    this.age = age1
//    this.email = email1
//    this.telephoneNumber = telephoneNumber1
//    this.address = address1
//    this.wallet = wallet1
  }


  //Getter
  def getCustomerID : String = {
    CustomerID
  }


  //ToString
  override def ToString = {
    "Customer ID: %s\n".format(CustomerID)
  }

  def test(x : Int): Unit = {

  }

  //Add car to finish
//  def test(g : Garage): Unit = {
//    g.CarQueue ++= CustomerVehicle
//  }


}
