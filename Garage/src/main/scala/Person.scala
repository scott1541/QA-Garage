
abstract class Person(var perID: Int, val name: String){

  def setperID(newPID: Int): Unit = {perID = newPID}
  def getperID(): Int = {perID}
  def getName(): String = {name}

  /*
  var name
  var contactNum
  var address
  var wallet

*/
}
