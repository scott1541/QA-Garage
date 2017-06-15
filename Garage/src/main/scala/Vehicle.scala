
abstract class Vehicle(var vehicleID: Int,val vehicleReg: String, owner: Customer) {

  def getOwner(): Customer = {owner}
  def getVID(): Int = {vehicleID}
  def setVID(newID: Int): Unit = {vehicleID = newID}
  def getReg(): String = {vehicleReg}

}
