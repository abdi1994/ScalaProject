package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Car (vehicle: Vehicle, carm : String, reg : String) extends Vehicle{

  var CarMake : String = ""
  var CarReg : String = ""
//  var Parts = List("Part1","Part2","Part3","Part4","Part5","Part6","Part7","Part8","Part9","Part10")


  //Setter
  def Car(carID : String, carType : String,vehicle: Vehicle, carm : String, reg : String): Unit = {
    this.VehicleID = carID
    this.VehicleType = carType
    this.CarMake = carm
    this.CarReg = reg
  }


  //Getter
  def getCarMake : String = {
    CarMake
  }

  def getCarReg : String = {
    CarReg
  }


  //ToString
  override def toString: String = {
    "Car Make: %s\nCar Reg: %s\nVehicle ID: %s\nVehicle Type: %s\n".format(CarMake, CarReg, VehicleID, VehicleType)
  }


}
