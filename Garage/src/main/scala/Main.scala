

object Main {
  def main(args: Array[String]) = {
    println("QA Garage System")

    //Employees
    val emp1 = new Employee(1, "Mick", "Mechanic")
    val emp2 = new Employee(2, "Luke", "Mechanic")
    val emp3 = new Employee(3, "Stew", "Mechanic")
    val emp4 = new Employee(4, "Charlie", "Mechanic")
    val emp5 = new Employee(5, "Jen", "Receptionist")
    val emp6 = new Employee(6, "Gareth", "Owner")

    //Customers
    val cust1 = new Customer(6, "John")
    val cust2 = new Customer(7, "Pete")
    val cust3 = new Customer(8, "Ali")
    val cust4 = new Customer(9, "Matt")
    val cust5 = new Customer(10, "Nick")

    //Vehicles
    val car1 = new Car(1, "AB10 XYZ",cust1)
    val car2 = new Car(2, "ER51 DUG", cust2)
    val car3 = new Car(3, "GL05 JUF", cust3)
    val car4 = new Car(4, "FN11 ROG", cust4)
    val car5 = new Bike(5, "DE07 ESD", cust5)
    val car6 = new Bike(6, "FG62 UMD", cust2)
    val car7 = new Car(1, "B626 AMK",cust1)
    val car8 = new Car(2, "P9 OLL ", cust2)
    val car9 = new Bike(3, "DN63 OUF", cust5)
    val car10= new Car(4, "FH07 UDD", cust4)
    val car11 = new Car(5, "V623 KOH", cust4)
    val car12 = new Bike(6, "H246 AMD", cust3)


    val garage = new Garage()

    garage.employeeList += (emp1, emp2, emp3, emp4, emp5, emp6)
    garage.vehicleList += (car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12)

    garage.openGarage()

    garage.contOfGarage()

    garage.startWork()

  }
}
