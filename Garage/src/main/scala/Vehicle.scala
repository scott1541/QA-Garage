import java.awt.Color

/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Vehicle(var vehicleID: Int, owner: Customer) {

  def getOwner(): Customer = {owner}
  def getVID(): Int = {vehicleID}
  def setVID(newID: Int): Unit = {vehicleID = newID}
/*
  val vehicleReg: String
  val manufacturer: String
  val model: String
  val seats: Int
  val wheels: Int
  val fuel: String
  val colour: Color
  var fixed: Boolean


//Get
  /def getVehicleReg: String

  // Set
  def fuel = (value:Int):Unit = _age = value
*/

}
