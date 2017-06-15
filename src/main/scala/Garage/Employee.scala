package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Employee(employeeid : String, name : String, jobrole : String, employeefreetime : Boolean) extends Person() {

  val EmployeeID = employeeid
  val Name = name
  val JobRole = jobrole
  val EmployeeFreeTime = employeefreetime

  //Setter

//  def Employee(employeeid : String, jobrole : String, employeebusy : Boolean): Unit = {
//    this.EmployeeID = employeeid
//    this.JobRole = jobrole
//    this.EmployeeFreeTime = employeebusy
//  }

  //Getter

  def getEmployeeID: String = {
    EmployeeID
  }

  def getJobRole: String = {
    JobRole
  }

  def getEmployeeFreeTime : Boolean = {
    EmployeeFreeTime
  }

  //Adds the employee to rotation
  def rotation(enterGarage : Garage) = {
    enterGarage.Employees.append(this)
  }


  //ToString
  override def ToString = {
    "Employee ID: %s\nJob Role: %s\nEmployee Free Time: %s\nName: %s\nAge: %s\nEmail: %s\nTelephone Number: %s\nAddress: %s\nWallet: %s".format(EmployeeID, JobRole, EmployeeFreeTime)
  }




}
