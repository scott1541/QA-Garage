import scala.collection.mutable.ListBuffer


class Garage {

  var garageOpen = false

  var vehicleList = ListBuffer[Vehicle]()
  var employeeList = ListBuffer[Employee]()
  var availableMechanics = ListBuffer[Employee]()
  var peopleInGarage = ListBuffer[Person]()


  def openGarage(): Unit = {
    garageOpen = true

    employeeList.foreach(item => if (item.getJob() != null) {
      peopleInGarage += item
    })
  }

  def closeGarage(): Unit = {

    garageOpen = false
    peopleInGarage.foreach(item => {
      peopleInGarage -= item
    })
  }

  def getAvailableMech(): Unit = {
    availableMechanics.clear()
    employeeList.foreach(item => if (item.getJob() == "Mechanic" && item.getStatus() == false) {
      availableMechanics += item
    })
  }

  def startWork(): Unit = {

    workOnVehicle()
  }

  def addEmployee(newEm: Employee): Unit = {
    employeeList += newEm
  }

  def addVehicle(addVeh: Vehicle): Unit = {
    vehicleList += addVeh
  }

  def remVehicle(ID: Int): Unit = {
    vehicleList.foreach(item => if (item.getVID() == ID) {
      vehicleList -= item
    })
  }

  def remVehicle(Reg: String): Unit = {
    vehicleList.foreach(item => if (item.getReg() == Reg) {
      vehicleList -= item
    })
  }

  def remVehicle(owner: Customer): Unit = {
    vehicleList.foreach(item => if (item.getOwner() == owner) {
      vehicleList -= item
    })
  }

  def workOnVehicle(): Unit = {

    getAvailableMech()

    while (vehicleList.nonEmpty && availableMechanics.nonEmpty) {
      println("Mechanic " + availableMechanics.head.getName() + " is working on vehicle: " + vehicleList.head.getReg())
      //Thread.sleep(250)
      availableMechanics.head.doWork()

      if (availableMechanics.tail.isEmpty) {
        employeeList.foreach(item => if (item.getJob() == "Mechanic") {
          item.setStatus(false)
        })
      }
      getAvailableMech()

      println("Vehicle: " + vehicleList.head.getReg() + " is fixed. ")
      vehicleList.head.getOwner().payGarage(100) //Each fix costs £100  #bestgarageever
      println(vehicleList.head.getOwner().name + " now owes the garage: £" + vehicleList.head.getOwner().owes)

      vehicleList -= vehicleList.head
    }

    if (availableMechanics.nonEmpty)
      println("All vehicles fixed!")
    else
      println("No available mechanics, vehicles not fixed!")

    closeGarage()
  }

  def contOfGarage(): Unit = {
    println("Contents of Garage: ")
    println("People: ")
    println(peopleInGarage.foreach(item => print(item.name + " ")))
    println(vehicleList.foreach(item => println("Vehicle: " + item.vehicleReg)))
  }

  //Debug/Testing methods

  def dumpVehicleList(): ListBuffer[Vehicle] = {
    vehicleList
  }

  def dumpEmployeeList(): ListBuffer[Employee] = {
    employeeList
  }

  def dumpAvailMechanics(): ListBuffer[Employee] = {
    availableMechanics
  }

  def dumpPeopleInGarage(): ListBuffer[Person] = {
  peopleInGarage
  }
}
