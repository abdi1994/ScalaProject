package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Employee(employeeid : String, jobrole : String, name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, employeefreetime : Boolean) extends Person() {

  var EmployeeID : String = employeeid
  var JobRole : String = jobrole
  override val name : String = name1
  override val age : Int = age1
  override val email : String = email1
  override val telephoneNumber : String = telephoneNumber1
  override val address : String = address1
  var EmployeeFreeTime : Boolean = employeefreetime

  //Setter

//  def Employee(employeeid : String, jobrole : String, employeebusy : Int): Unit = {
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


  //ToString
  override def ToString = {
    "Employee ID: %s\nJob Role: %s\nEmployee Free Time: %s\nName: %s\nAge: %s\nEmail: %s\nTelephone Number: %s\nAddress: %s\nWallet: %s".format(EmployeeID, JobRole, EmployeeFreeTime)
  }


  def EmployeeJoinsGarage(x : Garage) = {
    x.Employees.append(this)
  }

}
