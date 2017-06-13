package Garage

/**
  * Created by Administrator on 06/06/2017.
  */
class Employee extends Person {

  var EmployeeID : String = ""
  var JobRole : String = ""
  var EmployeeFreeTime : Int = 480

  //Setter

  def Employee(employeeid : String, jobrole : String, employeebusy : Int ,name1 : String, age1 : Int, email1 : String, telephoneNumber1 : String, address1 : String, wallet1 : Int): Unit = {
    this.EmployeeID = employeeid
    this.JobRole = jobrole
    this.EmployeeFreeTime = employeebusy
    this.name = name1
    this.age = age1
    this.email = email1
    this.telephoneNumber = telephoneNumber1
    this.address = address1
    this.wallet = wallet1
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
    "Employee ID: %s\nJob Role: %s\nEmployee Free Time: %s\nName: %s\nAge: %s\nEmail: %s\nTelephone Number: %s\nAddress: %s\nWallet: %s".format(EmployeeID, JobRole, EmployeeFreeTime, name, age, email, telephoneNumber, address, wallet)
  }

}
