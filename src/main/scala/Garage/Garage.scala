package Garage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 06/06/2017.
  */
class Garage {

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

  def removeVehicle(VehReg : String) = {
    CarsInGarage = CarsInGarage.filterNot(v => VehReg == v.VehicleID)
  }

  def registerEmployee(newEmployee : Employee): Unit = {
    Employees.append(newEmployee)
  }


  def calculateBill(x : Vehicle) : Int = {
    var FixingBill : Int = 0

    x.Parts.foreach{
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



}
