package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Vehicle {

  var VehicleID : String = ""
  var VehicleType : String = ""


  //Setter

  def Vehicle(vehicleid1 : String, vehicletype1 : String): Unit = {
    this.VehicleID = vehicleid1
    this.VehicleType = vehicletype1
  }


  //Getter

  def getVehicleID : String = {
    VehicleID
  }

  def getVehicleType : String = {
    VehicleType
  }


  //ToString

  def ToString = {
    "Vehicle ID: %s \nVehicle Type: %s".format(VehicleID, VehicleType)
  }

}
