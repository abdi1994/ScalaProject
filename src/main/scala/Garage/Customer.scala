package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Customer(customerid : String, customervehicle : List[Vehicle]) extends Person {

  val CustomerID = customerid
  override val name : String
  override val age : Int
  override var email : String
  override var telephoneNumber : String
  override var address : String
  override var wallet : Int
  val CustomerVehicle = customervehicle


//  //Setter
//  def Customer(customerid : String): Unit = {
//    this.CustomerID = customerid
//  }


  //Getter
  def getCustomerID : String = {
    CustomerID
  }


  //ToString
  override def ToString = {
    "Customer ID: %s\n".format(CustomerID)
  }

  def test(addToGarage : Garage): Unit = {
    addToGarage.CarQueue ++ CustomerVehicle
  }

  //Add car to finish
//  def test(g : Garage): Unit = {
//    g.CarQueue ++= CustomerVehicle
//  }


}
