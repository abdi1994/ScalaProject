package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
//Abstract is added to remove error however alternative would be implementation
class Car (carmake : String, carreg : String) extends Vehicle{

  var CarMake = carmake
  var CarReg = carreg
  val Parts = List("Part1", "Part2", "Part3", "Part4", "Part5", "Part6", "Part7", "Part8", "Part9", "Part10")
//  var Parts = List("Part1","Part2","Part3","Part4","Part5","Part6","Part7","Part8","Part9","Part10")


//  //Setter
//  def Car(carID : String, carType : String,vehicle: Vehicle, carm : String, reg : String, carparts : List[Part]): Unit = {
//    this.VehicleID = carID
//    this.VehicleType = carType
//    this.CarMake = carm
//    this.CarReg = reg
//  }


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
