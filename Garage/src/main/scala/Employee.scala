
class Employee(ID: Int, name: String, var job: String) extends Person(ID, name) {

  var busy = false

  override def getName(): String = {name}
  def getStatus(): Boolean = {busy}
  def setStatus(newStatus: Boolean): Unit = {busy = newStatus}
  def getJob(): String = {job}
  def setJob(newJob: String): Unit = {job = newJob}

  def doWork(): Unit = {
    busy = true
    //Thread.sleep(5000)
    //busy = false
  }
}
