/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Person(var perID: Int, val name: String){

  def setperID(newPID: Int): Unit = {perID = newPID}
  def getperID(): Int = {perID}
  def getName(): String = {name}

  /*
  val personID
  var name
  var contactNum
  var address
  var wallet

  //Get
  def personID: Int
  def name: String
  def contactNum: Int
  def address: String
  def wallet: Int

  //Set
  def personID = (a: Int)
  def name = (a: String)
*/
}
