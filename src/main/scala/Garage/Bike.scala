package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
//Abstract is added to remove error however alternative would be implementation
class Bike(bikemake : String, bikereg : String) extends Vehicle{

  val BikeMake = bikemake
  val BikeReg = bikereg
  override var VehicleID : String
  override var VehicleType : String
  val Parts = List("Part1", "Part2", "Part3", "Part4", "Part5", "Part6", "Part7", "Part8", "Part9", "Part10")
  //var Parts = List("Part1","Part2","Part3","Part4","Part5","Part6","Part7","Part8","Part9","Part10")


//  //Setter
//  def Bike(bikeID : String, bikeType : String, carm : String, reg : String, bikeparts : List[Part]): Unit = {
//    this.VehicleID = bikeID
//    this.VehicleType = bikeType
//    this.BikeMake = carm
//    this.BikeReg = reg
//  }


  //Getter
  def getBikeMake : String = {
    BikeMake
  }

  def getBikeReg : String = {
    BikeReg
  }


  //ToString
  override def ToString = {
    "Bike Make: %s\nBike Reg: %s\nVehicle ID: %s\nVehicle Type: %s".format(BikeMake, BikeReg, VehicleID, VehicleType)
  }

}
