package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 06/06/2017.
  */
class Garage {

  def main(args: Array[String]): Unit = {

    //val e = new Customer("1", "C2", "Test", 20, "Test-Email", "number", "test", 200)


  }

  val GarageCapacity : Int = 10
  var CarsInGarage: ListBuffer[Vehicle] = ListBuffer.empty
  val Employees : ListBuffer[Employee] = ListBuffer.empty
  var GarageOpen : Boolean = false
  var CarQueue : ListBuffer[Vehicle] = ListBuffer.empty


  def addVehicle(newVehicle : Vehicle): Unit = {
    if (CarsInGarage.length < GarageCapacity && GarageOpen == true) {
      CarsInGarage.append(newVehicle)
    }
    else {
      CarQueue.append(newVehicle)
    }
  }

  def removeVehicleByID(VehReg : String) = {
    CarsInGarage = CarsInGarage.filterNot(v => VehReg == v.VehicleID)
  }

  def removeVehicleByModel(VehMod : String) = {
    CarsInGarage = CarsInGarage.filterNot(v => VehMod == v.VehicleType)
  }

  def removeVehicleByModAndID(VehReg : String, VehMod : String) = {
    CarsInGarage = CarsInGarage.filterNot(v => VehReg == v.VehicleID && VehMod == v.VehicleType)
  }

  def registerEmployee(newEmployee : Employee): Unit = {
    Employees.append(newEmployee)
  }


  def calculateBill(x : Vehicle) : Int = {
    var FixingBill : Int = 0

    x.VehicleParts.foreach{
      case part => if(part.Broken == true) {
        FixingBill += part.CostAndDuration()._2
      }
      else {}
      case _=>
    }
    FixingBill
  }

  def removeQueue() = {
    if(CarsInGarage.length < GarageCapacity && CarQueue.nonEmpty) {
      CarsInGarage.append(CarQueue(0))
    }
  }

// To finish!!!
//  def EmployeeAvailability() = {
//
//    CarsInGarage.map(x => x.VehicleParts().foreach(x => x != false))
//
//  }


  def openGarage(): Unit = {
    GarageOpen = true
    var TotalDayEarning : Int = 0


  }

  def closeGarage(): Unit = {
    GarageOpen = false
  }

  def freeEmployee(): Unit = {
    Employees.find(z => Employees.contains(z) && z.EmployeeFreeTime > 0)
  }

  def ToString() = {
    "Employees: %s\nCars in Garage: %s\nCars in Queue: %s\n".format(Employees, CarsInGarage, CarQueue)
  }


}
