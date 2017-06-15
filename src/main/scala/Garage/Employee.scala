package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Employee(name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int) extends Person(name1, age1, email1, telephoneNumber1, address1, wallet1) {

  var EmployeeID : String = ""
  var JobRole : String = ""
  var EmployeeFreeTime : Int = 480

  //Setter

  def Employee(employeeid : String, jobrole : String, employeebusy : Int): Unit = {
    this.EmployeeID = employeeid
    this.JobRole = jobrole
    this.EmployeeFreeTime = employeebusy
  }

  //Getter

  def getEmployeeID: String = {
    EmployeeID
  }

  def getJobRole: String = {
    JobRole
  }

  def getEmployeeFreeTime : Int = {
    EmployeeFreeTime
  }


  //ToString
  override def ToString = {
    "Employee ID: %s\nJob Role: %s\nEmployee Free Time: %s\nName: %s\nAge: %s\nEmail: %s\nTelephone Number: %s\nAddress: %s\nWallet: %s".format(EmployeeID, JobRole, EmployeeFreeTime)
  }

}
