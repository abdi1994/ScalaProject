package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle {

  val VehicleID : String = ""
  val VehicleType : String = ""
  val VehicleParts : List[Part]
  var worker : Option[Employee]


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

  def finRepair(t : Int) : Boolean = worker match {
    case Some(employee) => employee.EmployeeFreeTime == true
    case None => false
  }


  //ToString
  def ToString = {
    "Vehicle ID: %s \nVehicle Type: %s".format(VehicleID, VehicleType)
  }

}
