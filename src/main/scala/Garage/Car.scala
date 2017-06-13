package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Car (vehicle: Vehicle, carm : String, reg : String) extends Vehicle{

  var CarMake : String = ""
  var CarReg : String = ""


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

//  override def ToString =  {
//    "Car Make: %s \nReg: %s\nVehicle Details: ".foreach(CarMake, BikeReg, Vehicle(vehicleid1 = "", vehicletype1 = ""))
//  }


}
