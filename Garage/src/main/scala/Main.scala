/**
  * Created by Administrator on 13/06/2017.
  */
object Main {
  def main(args: Array[String]) = {
    println("Hello World")

    //Employees
    var emp1 = new Employee(1, "Mick", "Mechanic")
    var emp2 = new Employee(2, "Luke", "Mechanic")
    var emp3 = new Employee(3, "Stew", "Mechanic")

    //Customers
    var cust1 = new Customer(6, "John")
    var cust2 = new Customer(7, "Pete")
    var cust3 = new Customer(8, "Ali")
    var cust4 = new Customer(9, "Matt")
    var cust5 = new Customer(10, "Nick")

    //Vehicles
    var car1 = new Car(1, cust1)
    var car2 = new Car(2, cust2)
    var car3 = new Car(3, cust3)
    var car4 = new Car(4, cust4)
    var car5 = new Car(5, cust5)
    var car6 = new Bike(6, cust2)


    var garage = new Garage()

    garage.employeeList += (emp1, emp2, emp3)
    garage.vehicleList += (car1, car2, car3, car4, car5, car6)

    garage.openGarage()

  }
}
