import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 13/06/2017.
  */
class Garage {

  var garageOpen = false

  var vehicleList = ListBuffer[Vehicle]()
  var employeeList = ListBuffer[Employee]()
  var availableMechanics = ListBuffer[Employee]()
  var peopleInGarage = ListBuffer[Person]()

  //def addCustomer() = {}

  def openGarage(): Unit = {
    garageOpen = true
    //peopleInGarage = employeeList
  }

  def closeGarage(): Unit = {
    garageOpen = false
  }

  def startWork(): Unit = {

  }

  def addEmployee(newEm: Employee): Unit = {
    employeeList += newEm
  }

  //def remEmployee() = {}

  def addVehicle(addVeh: Vehicle): Unit = {

    vehicleList += addVeh

  }
  def remVehicle(ID: Int): Unit = {
    vehicleList.foreach(item => if(item.getVID() == ID) {
      vehicleList -= item
    })
  }
  //Overload for rem by type
  //def remVehicle

  def workOnVehicle(): Unit = {

    //availableMechanics += employeeList.foreach(item => item.busy == false)
    //var availableMechnics = employeeList.foreach
    while(vehicleList.nonEmpty && availableMechanics.nonEmpty)
  }

  def contOfGarage(): Unit = {
    println("Contents of Garage: \n")
    println("People: " + peopleInGarage.foreach(item => println(item)))
    println("Vehicles: " + vehicleList.foreach(item => println(item)))
  }

  //Debug/Testing methods

  def dumpVehicleList(): ListBuffer[Vehicle] = {
    vehicleList
  }

  def dumpEmployeeList(): ListBuffer[Employee] = {
    employeeList
  }
}
