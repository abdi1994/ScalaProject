package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Bike (vehicle: Vehicle, carm : String, reg : String) extends Vehicle{

  var BikeMake : String = ""
  var BikeReg : String = ""


  //Setter
  def Bike(bikeID : String, bikeType : String, carm : String, reg : String): Unit = {
    this.VehicleID = bikeID
    this.VehicleType = bikeType
    this.BikeMake = carm
    this.BikeReg = reg
  }


  //Getter
  def getBikeMake : String = {
    BikeMake
  }

  def getBikeReg : String = {
    BikeReg
  }

  //  override def ToString =  {
  //    "Bike Make: %s \nReg: %s\nVehicle Details: ".foreach(BikeMake, BikeReg, Vehicle(vehicleid1 = "", vehicletype1 = ""))
  //  }

}
