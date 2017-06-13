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




  def openGarage(): Unit = {
    GarageOpen = true
  }

  def closeGarage(): Unit = {
    GarageOpen = false
  }



}
