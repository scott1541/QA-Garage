
class Customer(ID: Int, name: String) extends Person(ID, name) {

  var owes = 0

  def payGarage(money: Int): Unit = { owes += money }

}
