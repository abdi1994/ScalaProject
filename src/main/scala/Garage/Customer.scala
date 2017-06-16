package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Customer (name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, vehicle1 : List[Vehicle]) extends Person() {

//  var CustomerID = ""
  override val name : String = name1
  override val age : Int = age1
  override val email : String = email1
  override val telephoneNumber : String = telephoneNumber1
  override val address : String = address1
  val vehicle = vehicle1

  //Setter
//  def Customer(customerid : String): Unit = {
//    this.CustomerID = customerid
//    this.VehicleID = vehicleID
//    this.name = name1
//    this.age = age1
//    this.email = email1
//    this.telephoneNumber = telephoneNumber1
//    this.address = address1
//    this.wallet = wallet1
//  }


  //Getter
//  def getCustomerID : String = {
//    CustomerID
//  }


  //ToString
//  override def ToString = {
//    "Customer ID: %s\n".format(CustomerID)
//  }

  def test(x : Garage) = {

    x.CarQueue ++ vehicle

  }

  //Add car to finish
//  def test(g : Garage): Unit = {
//    g.CarQueue ++= CustomerVehicle
//  }


}
