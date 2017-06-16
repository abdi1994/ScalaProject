package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle {

  val VehicleID : String = ""
  val VehicleType : String = ""
  val VehicleParts : List[Part]


  //Setter

//  def Vehicle(vehicleid1 : String, vehicletype1 : String, VParts : List[Part]): Unit = {
//    this.VehicleID = vehicleid1
//    this.VehicleType = vehicletype1
//    this.VehicleParts = VParts
//  }


  //Getter

  def getVehicleID : String = {
    VehicleID
  }

  def getVehicleType : String = {
    VehicleType
  }

  def get


  //ToString
  def ToString = {
    "Vehicle ID: %s \nVehicle Type: %s".format(VehicleID, VehicleType)
  }

}
